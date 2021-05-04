package gameProject;

public class GamerManager implements GamerService{
	
	UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {		
		this.userValidationService = userValidationService;
	}

	@Override
	public void addGamer(Gamer gamer) {
		if(userValidationService.UserValidate(gamer) ) {
			System.out.println(gamer.getFirstName() + " adli oyuncu sisteme eklendi.");
		} else {
			System.out.println(gamer.getFirstName() + " adli oyuncunun bilgileri dogrulanamadi.");
		}		
	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" adli oyuncu guncellendi.");	
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		System.out.println(gamer.getFirstName() +" adli oyuncu silindi.");
		
	}

}
