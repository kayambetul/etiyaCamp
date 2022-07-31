package kodlamaioCleanCode.business.concretes;

import java.util.List;

import kodlamaioCleanCode.business.absratcts.CampaignService;

import kodlamaioCleanCode.entities.concretes.EducationSale;

public class PercentDiscountCampaignManager implements CampaignService{


	@Override
	public void updatePrice(List<EducationSale> educationSales) {
		for (EducationSale educationSale : educationSales) {
			educationSale.setSale(educationSale.getSale()-(educationSale.getSale()*getPercentageDiscount()));
		}
		
	}

	
	private double getPercentageDiscount() {
		return 0.90;
		
	}
}
