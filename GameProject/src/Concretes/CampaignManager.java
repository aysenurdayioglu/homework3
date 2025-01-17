package Concretes;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Yeni kampanya eklendi: " + campaign.getCampaignName() + 
							" - �ndirim oran�: % " + campaign.getDiscount() );
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Kampanya g�ncellendi: " + campaign.getCampaignName());
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Kampanya silindi: " + campaign.getCampaignName());
	}

}
