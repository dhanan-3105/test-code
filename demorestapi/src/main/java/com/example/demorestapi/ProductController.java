package com.example.demorestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/products")
@ResponseBody
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping ( consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Product addProduct(@RequestBody Product product) throws Exception {
        return service.saveProduct(product);
        		}

    @GetMapping (produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> findAllProducts() throws Exception {
        return service.getProducts();
    }

    @GetMapping(value="{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PutMapping (produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping(value="{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}

