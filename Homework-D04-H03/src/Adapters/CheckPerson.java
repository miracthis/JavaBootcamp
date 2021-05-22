package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckServices;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CheckPerson implements GamerCheckServices{
	
	

	@Override
	public boolean checkGamer(Gamer gamer) throws RemoteException {
		
KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(
				Long.parseLong(gamer.getIdentityNo()), 
						gamer.getFirstName(), 
						gamer.getLastName(), 
						gamer.getBirthOfYear());
		
		return result;
		
	}

		
}
