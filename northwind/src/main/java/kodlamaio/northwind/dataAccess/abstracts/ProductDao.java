package kodlamaio.northwind.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import kodlamaio.northwind.entities.concretes.Product;

@EnableJpaRepositories
public interface ProductDao extends JpaRepository<Product,Integer>{
	
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByCategoryIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	@Query("from Product where productName=:productName and category.categoryId=:category")
	List<Product> getByNameAndCategory(String productName, int category);
	

	//select * from products where product_name = bişey and category_id = 1
	
}
