package Api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GoogleApiManager implements ApiService{

	@Override
	public boolean checkMail(String email) {
		String mailPattern="^[A-Z0-9._%+-]+@(gmail)+.(com)?$";
		Pattern pattern=Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);
		
			Matcher matcher=pattern.matcher(email);
			if(matcher.matches()==true) {
			return true;
			}
			System.out.println("Google hesabý geçerli deðil...");
			return false;
			
		
		
	}

	@Override
	public void log(String message) {
		System.out.println("Google ile kayýt baþarýlý..");
		
	}

}
