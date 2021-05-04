package gameProject;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +" adli kampanya eklendi.");		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +" adli kampanya guncellendi.");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() +" adli kampanya silindi.");
		
	}

}
