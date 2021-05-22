package Business.concretes; 
import java.util.Scanner;

import Api.ApiService;
import Business.abstracts.UserService;
import Core.abstracts.UserVerifyService;
import Core.abstracts.ValidatorService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService{
	
	private  ValidatorService [] validatorService;
	private UserDao userDao;
	private UserVerifyService userVerifyService;
	private ApiService apiService;
	
	  public UserManager(UserDao userDao, ValidatorService[] validatorService, UserVerifyService userVerifyService, 
			  ApiService apiService) {
		
		  super();
		this.userDao = userDao;
		this.validatorService = validatorService;
		this.userVerifyService = userVerifyService;
		this.apiService = apiService;
	}

	@Override
	public void register(User user) {
		System.out.println("Say�n " +user.getFirstName());
		
		for (ValidatorService validatorService : validatorService) {
			if(validatorService.checkUser(user)==false) {
				System.out.println("Kullan�c� Bilgileri Do�rulamadan Ge�emedi. Kay�t Ba�ar�s�z.");
				System.out.println("************************************************************");
				return;
			}
			
		}
		
		if(userVerifyService.userVerify()==false) 
		{
			System.out.println("Do�rulama ba�ar�s�z...");
			return;
		}
		else 
		{
			System.out.println("Say�n " +user.getFirstName());
			System.out.println("Kullan�c�n�z ba�ar�l� �ekilde olu�turuldu.");
			
			userDao.add(user);
		}
			
	}

	@Override
	public void login(User user) {
		System.out.println("***LOGIN***");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("L�tfen mailinizi giriniz..");
		String email=input.nextLine();
		System.out.println("L�tfen �ifrenizi giriniz..");
		String password=input.nextLine();
		
		
		
		if(email.equals(user.getEmail())&& password.equals(user.getPassword())) {
			userDao.login(user.getEmail(), user.getPassword());
			System.out.println("******************************");
			
			return;
		}
		else {
			System.out.println("Giri� ba�ar�s�z..");
			System.out.println("******************************");
		}
		
	}

	@Override
	public void googleRegister(User user) {
		

		for (ValidatorService validatorService : validatorService) {
			if(validatorService.checkUser(user)==false) {
				System.out.println("Google �le Kay�t Ba�ars�z. ");
				System.out.println("*******");
				return;
			}
	
		}
		
		if(apiService.checkMail(user.getEmail())==true) {
			apiService.log("Google ile kay�t: " +user.getEmail());
			System.out.println("*******");
			userDao.add(user);
		}
		
	}

	@Override
	public void googleLogin(User user) {
		
	System.out.println("Google ile giri� ba�ar�l�");
		
	}

}
