package gameProject;

public class Main {

	public static void main(String[] args) {
		
		SaleManager saleManager = new SaleManager();
		GameManager gameManager = new GameManager();
		GamerManager gamerManager = new GamerManager(new UserValidationManager());
		CampaignManager campaignManager = new CampaignManager();
		
		Gamer gamer1 = new Gamer(1,"Ali","Veli","11111111111",2002);
		Gamer gamer2 = new Gamer(2,"Ayþe","Yilmaz","99999999999",1955);
		
		Game game1 = new Game(1,"The Sims", 80);
		Game game2 = new Game(2,"Pubg", 40);
		
		Campaign campaign1 = new Campaign(1,"Bahar kampanyasi",10);
		
		System.out.println("------------------------------------------");		
		gamerManager.addGamer(gamer1);
		gameManager.addGame(game1);
		campaignManager.addCampaign(campaign1);
		saleManager.buyGame(gamer1, game1, campaign1);
		
		System.out.println("------------------------------------------");
		gamerManager.addGamer(gamer2);
		gamerManager.updateGamer(gamer2);
		saleManager.buyGame(gamer2, game2);
		

	}

}
