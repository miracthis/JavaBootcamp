package Core.concretes;
import java.util.ArrayList;
import Core.abstracts.ValidatorService;
import Entities.concretes.User;

public class RepeatMailValidator implements ValidatorService{

	private ArrayList<String> mails=new ArrayList<String>();
	
	
	public RepeatMailValidator() {
		
	}


	@Override
	public boolean checkUser(User user) {
		if(mails.isEmpty()) {
			mails.add(user.getEmail());
			return true;
		}
		 for (String mail : mails) {
			if(mail==user.getEmail()) {
				System.out.println("Bu mail adresi daha önce kullanýlmýþ...");
				return false;
		}	
		}
		 
			mails.add(user.getEmail());
			return true;
		
		
	}

}
