package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void gameAdd(Game game) {
		
		System.out.println("Oyun Eklendi: " + game.getGameName() + " Tutar: " + game.getPrice());
		
	}

	@Override
	public void gameUpdate(Game game) {

		System.out.println("Oyun Güncellendi: " + game.getGameName() + " Tutar: " + game.getPrice());
		
	}

	@Override
	public void gameDelete(Game game) {

		System.out.println("Oyun Silindi: " + game.getGameName());
		
	}

	
	
}
