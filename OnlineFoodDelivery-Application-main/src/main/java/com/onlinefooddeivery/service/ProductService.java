package com.onlinefooddeivery.service;
import java.util.List;

import com.onlinefooddeivery.model.Category;
import com.onlinefooddeivery.model.Product;
import com.onlinefooddeivery.model.ProductPaging;

public interface ProductService {
	Product addProduct(Product product);
    List<Product> getAllProducts();
	Product getProductByProductId(long productId);
	Product updateProduct(Product product, long productId);
	void deleteProduct(long productId);
	List<Product> findByCategory(Category category);
	ProductPaging findByCategory(Category category, Integer pageNo, Integer pageSize);
	ProductPaging getAllProducts(Integer pageNo, Integer pageSize);
}