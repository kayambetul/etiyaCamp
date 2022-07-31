package kodlamaioCleanCode.dataAccess.abstracts;

import java.util.List;

import kodlamaioCleanCode.entities.concretes.EducationSale;

public interface EducationSaleDao {
	void add(EducationSale educationSale);
	List<EducationSale> getAll();

}
