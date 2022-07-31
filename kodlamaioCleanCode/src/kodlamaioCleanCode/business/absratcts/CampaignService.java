package kodlamaioCleanCode.business.absratcts;

import java.util.List;

import kodlamaioCleanCode.entities.concretes.EducationSale;

public interface CampaignService {
	void updatePrice(List<EducationSale> educationSales);

}
