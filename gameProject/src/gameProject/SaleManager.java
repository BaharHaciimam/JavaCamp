package gameProject;

public class SaleManager implements SaleService {

	@Override
	public void buyGame(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " adli oyuncu "+ game.getGameName() +" oyununu "
	+game.getGamePrice()+" tl'ye satin aldi.");
		
	}

	@Override
	public void buyGame(Gamer gamer, Game game, Campaign campaign) {
		double newPrice;
		newPrice= game.getGamePrice()-(game.getGamePrice()*campaign.getDiscount()/100);
		System.out.println(gamer.getFirstName() + " adli oyuncu "+ game.getGameName() +" oyununu "
				+newPrice+" tl'ye satin aldi.");
		
	}

}
