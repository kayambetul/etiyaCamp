package kodlamaioCleanCode.business.concretes;

import java.util.List;

import kodlamaioCleanCode.business.absratcts.CampaignService;
import kodlamaioCleanCode.dataAccess.abstracts.EducationSaleDao;
import kodlamaioCleanCode.entities.concretes.EducationSale;

public class StandardPriceCampaignManager implements CampaignService{



	@Override
	public void updatePrice(List<EducationSale> educationSales) {
		for (EducationSale educationSale : educationSales) {
			educationSale.setSale(currentStandardPrice());
		}
		
	}
	
	
	private  double currentStandardPrice() {
		return 25.0;
	}

}
