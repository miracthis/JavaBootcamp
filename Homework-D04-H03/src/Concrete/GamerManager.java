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
			
			System.out.println("Do�rulama Ba�ar�l�." + gamer.getIdentityNo() + " - " + gamer.getFirstName() + " " + gamer.getLastName());
			System.out.println("Oyuncu eklendi: " + gamer.getFirstName() + " " + gamer.getLastName());
			
		}else {
			System.out.println("Do�rulama Ba�ar�s�z Bilgileri Kontrol Edin." + gamer.getIdentityNo() + " " + gamer.getFirstName());
			System.out.println("Oyuncu Eklemesi Ba�ar�s�z.");
		}
		
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu g�ncellendi: " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi: " + gamer.getFirstName() + " " + gamer.getLastName());
		
	}

}
