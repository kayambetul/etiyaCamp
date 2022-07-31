package kodlamaioCleanCode.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlamaioCleanCode.dataAccess.abstracts.ProductDao;
import kodlamaioCleanCode.entities.concretes.Product;

public class HibernateProductDao implements ProductDao{

	
	@Override
	public void add(Product product) {
		System.out.println("Hibernate product eklendi.");
		
	}

	@Override
	public List<Product> getAll() {
		List<Product> products=new ArrayList<Product>();
		return products;
	}

}
