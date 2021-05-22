package Core.concretes;

import Core.abstracts.ValidatorService;
import Entities.concretes.User;

public class NameValidator implements ValidatorService{

	@Override
	public boolean checkUser(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;
		}
		System.out.println("�sim ve Soyisim alanlar� en az 2 karakterden olu�mal�d�r..");
		return false;
	}
	
}
