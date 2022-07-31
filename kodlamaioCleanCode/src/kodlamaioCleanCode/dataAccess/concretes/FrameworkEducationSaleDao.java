package kodlamaioCleanCode.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioCleanCode.dataAccess.abstracts.EducationSaleDao;
import kodlamaioCleanCode.entities.concretes.EducationSale;

public class FrameworkEducationSaleDao implements EducationSaleDao{

	List<EducationSale> educationSales=new ArrayList<EducationSale>();
	

	@Override
	public void add(EducationSale educationSale) {
		educationSales.add(educationSale);
		
	}

	@Override
	public List<EducationSale> getAll() {
		
		return educationSales;
	}

}
