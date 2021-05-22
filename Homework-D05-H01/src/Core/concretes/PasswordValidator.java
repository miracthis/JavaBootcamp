package Core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Core.abstracts.ValidatorService;
import Entities.concretes.User;

public class PasswordValidator implements ValidatorService{


	String passwordPattern="^.{6,}$";
	Pattern pattern=Pattern.compile(passwordPattern);
	
	@Override
	public boolean checkUser(User user) {
		Matcher matcher=pattern.matcher(user.getPassword());
		if(matcher.matches()==true) {
			return true;
		}
		System.out.println("Þifreniz en az 6 karakterden oluþmalýdýr...");
		return false;
	}

}
