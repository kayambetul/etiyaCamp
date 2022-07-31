package kodlamaioCleanCode.business.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioCleanCode.business.absratcts.CampaignService;
import kodlamaioCleanCode.business.absratcts.EducationSaleService;
import kodlamaioCleanCode.dataAccess.abstracts.EducationSaleDao;
import kodlamaioCleanCode.entities.concretes.EducationSale;

public class EducationSaleManager implements EducationSaleService {

	private EducationSaleDao educationSaleDao;
	private CampaignService campaignService;

	public EducationSaleManager(EducationSaleDao educationSaleDao,CampaignService campaignService) {
		super();
		this.educationSaleDao = educationSaleDao;
		this.campaignService=campaignService;
	}

	@Override
	public void add(EducationSale educationSale) {
		
		this.educationSaleDao.add(educationSale);

	}

	@Override
	public List<EducationSale> getAll() {	
		this.campaignService .updatePrice(this.educationSaleDao.getAll());
		return this.educationSaleDao.getAll();
	}


	
}
