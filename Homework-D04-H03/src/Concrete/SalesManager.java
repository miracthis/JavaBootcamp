package Concrete;

import Abstract.SalesServices;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesServices{

	@Override
	public void gameSales(Gamer gamer, Game game) {
		
		System.out.println("Oyun Sat��� Tamamland�");
		System.out.println("Al�c�: " + gamer.getFirstName() + " " + gamer.getLastName());
		System.out.println("Al�nan Oyun: " + game.getGameName());
		System.out.println("Tutar: " + game.getPrice() +" TL");
		
	}

	@Override
	public void campaignGameSales(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Kampanyal� Oyun Sat��� Tamamland�");
		System.out.println("Al�c�: " + gamer.getFirstName() + " " + gamer.getLastName());
		System.out.println("Al�nan Oyun: " + game.getGameName());
		System.out.println("Tutar: " + game.getPrice() +" TL");
		System.out.println("�ndirim Oran�: %" + campaign.getDiscount());
		campaign.setAfterDiscountTotal(game.getPrice() - (game.getPrice()/100*campaign.getDiscount()));
		System.out.println("Kampanya Sonras� Sat�� Tutar�: " + campaign.getAfterDiscountTotal());
		
	}

}
