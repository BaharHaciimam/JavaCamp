package gameProject;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game) {
		System.out.println(game.getGameName() + " adli oyun eklendi");		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println(game.getGameName() + " adli oyun güncellendi.");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println(game.getGameName() + " adli oyun silindi.");
		
	}

}
