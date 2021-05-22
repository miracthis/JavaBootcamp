package Core.concretes;

import Core.abstracts.ValidatorService;
import Entities.concretes.User;

public class NameValidator implements ValidatorService{

	@Override
	public boolean checkUser(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;
		}
		System.out.println("İsim ve Soyisim alanları en az 2 karakterden oluşmalıdır..");
		return false;
	}
	
}
