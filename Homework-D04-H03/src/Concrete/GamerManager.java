package Concrete;

import java.rmi.RemoteException;

import Abstract.GamerCheckServices;
import Abstract.GamerService;
import Adapters.CheckPerson;
import Entities.Gamer;

public class GamerManager implements GamerService {

	GamerCheckServices gms = new CheckPerson();
	
	@Override
	public void add(Gamer gamer) throws RemoteException {
		
		
		boolean result = gms.checkGamer(gamer);
		
		if (result == true) {
			
			System.out.println("Doðrulama Baþarýlý." + gamer.getIdentityNo() + " - " + gamer.getFirstName() + " " + gamer.getLastName());
			System.out.println("Oyuncu eklendi: " + gamer.getFirstName() + " " + gamer.getLastName());
			
		}else {
			System.out.println("Doðrulama Baþarýsýz Bilgileri Kontrol Edin." + gamer.getIdentityNo() + " " + gamer.getFirstName());
			System.out.println("Oyuncu Eklemesi Baþarýsýz.");
		}
		
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi: " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi: " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

}
