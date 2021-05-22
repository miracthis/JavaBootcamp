package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("Kampanya Eklendi: " + campaign.getCampaignName() + " - Kampanya Ýndirim Oraný: %" + campaign.getDiscount());
		
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println("Kampanya Güncellendi: " + campaign.getCampaignName() + " - Kampanya Ýndirim Oraný: %" + campaign.getDiscount());
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {

		System.out.println("Kampanya Silindi: " + campaign.getCampaignName());
		
	}

	
	
}
