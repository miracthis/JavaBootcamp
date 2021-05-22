package Abstract;

import java.rmi.RemoteException;

import Entities.Gamer;

public interface GamerCheckServices {

	public boolean checkGamer (Gamer gamer) throws RemoteException;
	
}
