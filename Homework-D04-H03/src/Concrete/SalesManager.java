package Concrete;

import Abstract.SalesServices;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesServices{

	@Override
	public void gameSales(Gamer gamer, Game game) {
		
		System.out.println("Oyun Satýþý Tamamlandý");
		System.out.println("Alýcý: " + gamer.getFirstName() + " " + gamer.getLastName());
		System.out.println("Alýnan Oyun: " + game.getGameName());
		System.out.println("Tutar: " + game.getPrice() +" TL");
		
	}

	@Override
	public void campaignGameSales(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Kampanyalý Oyun Satýþý Tamamlandý");
		System.out.println("Alýcý: " + gamer.getFirstName() + " " + gamer.getLastName());
		System.out.println("Alýnan Oyun: " + game.getGameName());
		System.out.println("Tutar: " + game.getPrice() +" TL");
		System.out.println("Ýndirim Oraný: %" + campaign.getDiscount());
		campaign.setAfterDiscountTotal(game.getPrice() - (game.getPrice()/100*campaign.getDiscount()));
		System.out.println("Kampanya Sonrasý Satýþ Tutarý: " + campaign.getAfterDiscountTotal());
		
	}

}
