package kodlamaioCleanCode.business.concretes;

import java.util.List;

import kodlamaioCleanCode.business.absratcts.ProductService;
import kodlamaioCleanCode.dataAccess.abstracts.ProductDao;
import kodlamaioCleanCode.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		productDao.add(product);
		
	}

	@Override
	public List<Product> getAll() {
		
		return productDao.getAll();
	}

}
