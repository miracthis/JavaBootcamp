package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SalesServices {
	
	void gameSales(Gamer gamer, Game game);
	
	void campaignGameSales(Gamer gamer, Game game ,Campaign campaign);

}
