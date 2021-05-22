package Core.concretes;

import java.util.Scanner;

import Core.abstracts.UserVerifyService;

public class UserVerifyCode implements UserVerifyService{

	
	
	@Override
	public boolean userVerify() {
		System.out.println("****Kullan�c� Do�rulama****");
		int realCode = (int) (Math.random() * 100000);
		System.out.println("Do�rulama kodunuz: "+realCode);
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);	
		System.out.println("L�tfen do�rulama kodunu giriniz..");
		int inputCode=input.nextInt();
		
		if(realCode==inputCode) {
			return true;
		}
		
		return false;
	}

}
