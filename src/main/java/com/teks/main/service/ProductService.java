package com.teks.main.service;

import com.teks.main.entity.Product;

import java.util.List;

public interface ProductService {

//    Method to addd or save the product
    public Product addProduct(Product product);

//    Method to get all products
    public List<Product> getAllProducts();


//    Method to get product by id
    Product getProductById(int id);

//    update product by id
    Product updateProduct(int id,Product product);


//    Delete product by id
    void deleteproduct(int id);

};
