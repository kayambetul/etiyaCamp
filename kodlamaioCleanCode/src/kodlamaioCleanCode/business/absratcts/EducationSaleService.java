package kodlamaioCleanCode.business.absratcts;

import java.util.List;

import kodlamaioCleanCode.entities.concretes.EducationSale;

public interface EducationSaleService {
	void add(EducationSale educationSale);
	List<EducationSale> getAll();
	

}
