package com.example.demorestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    
    

    public Product saveProduct(Product product) {
    	// repository.createProducts();
        return repository.save(product);
    }

    public List<Product> getProducts() {
    	//repository.createProducts();
        return repository.getAllProducts();
    }

    public Product getProductById(int id) {
        return repository.findById(id);
    }

    public String deleteProduct(int id) {
        repository.delete(id);
        return "product removed !! " + id;
    }

    public Product updateProduct(Product product) {
       return repository.update(product);
    }
}
