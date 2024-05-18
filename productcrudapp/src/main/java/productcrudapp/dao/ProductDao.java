package productcrudapp.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.save(product);
	}
	
	//Get all products
	public java.util.List<Product> getAllproducts() {
		java.util.List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
		
	}
	
	
	//Delete single product
	@Transactional
	public void deleteProduct(int id) {
		Product load = this.hibernateTemplate.load(Product.class, id);
		this.hibernateTemplate.delete(load);
	}
	
	
	//Get single product
	public Product getProduct(int id) {
		return this.hibernateTemplate.get(Product.class, id);
		
	}

}
