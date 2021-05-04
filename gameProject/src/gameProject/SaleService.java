package gameProject;

public interface SaleService {
	void buyGame(Gamer gamer, Game game);
	void buyGame(Gamer gamer, Game game, Campaign campaign);
}
