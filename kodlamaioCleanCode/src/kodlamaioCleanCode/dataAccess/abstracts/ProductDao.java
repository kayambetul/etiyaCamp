package kodlamaioCleanCode.dataAccess.abstracts;

import java.util.List;

import kodlamaioCleanCode.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	List<Product> getAll();
	

}
