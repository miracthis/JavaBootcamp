package Core.concretes;

import java.util.Scanner;

import Core.abstracts.UserVerifyService;

public class UserVerifyCode implements UserVerifyService{

	
	
	@Override
	public boolean userVerify() {
		System.out.println("****Kullanýcý Doðrulama****");
		int realCode = (int) (Math.random() * 100000);
		System.out.println("Doðrulama kodunuz: "+realCode);
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);	
		System.out.println("Lütfen doðrulama kodunu giriniz..");
		int inputCode=input.nextInt();
		
		if(realCode==inputCode) {
			return true;
		}
		
		return false;
	}

}
