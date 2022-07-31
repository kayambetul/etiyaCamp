package kodlamaioCleanCode.business.absratcts;

import java.util.List;

import kodlamaioCleanCode.entities.concretes.Product;



public interface ProductService {
	
	void add(Product product);
	List<Product> getAll();
	
}
