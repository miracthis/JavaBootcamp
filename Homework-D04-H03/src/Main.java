

import java.rmi.RemoteException;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) throws RemoteException {

		Gamer gamer = new Gamer("1111111111", "İSİM", "SOYİSİM", 1990);
		GamerManager gm = new GamerManager();
		gm.add(gamer);
		System.out.println("--------------------------------------------------------------------");
		
		Campaign campaign = new Campaign(1,"Bahar Ýndirimi",20);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.campaignAdd(campaign);
		System.out.println("--------------------------------------------------------------------");
		Game game = new Game(1, "VALORANT", 150);
		GameManager gameManager = new GameManager();
		gameManager.gameAdd(game);
		System.out.println("--------------------------------------------------------------------");
		SalesManager salesManager = new SalesManager();
		salesManager.gameSales(gamer, game);
		System.out.println("--------------------------------------------------------------------");
		salesManager.campaignGameSales(gamer, game, campaign);
	
		
		
		
	}

}
