package gameProject;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean UserValidate(Gamer gamer) {
		if (gamer.getNationalIdentity().length() == 11) {
			System.out.println("Dogrulama ger�eklestirildi.");
			return true;
		}
		else 
			System.out.println("Dogrulama ger�eklestirilemedi.");
			return false;
		
	}

}
