package com.teks.main.service;

import com.teks.main.entity.Product;
import com.teks.main.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository repo;

    @Override
    public Product addProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Product Not Found"));
    }

    @Override
    public Product updateProduct(int id, Product newProductDetails) {

        Product existingProduct=getProductById(id);

        existingProduct.setProductName(newProductDetails.getProductName());
        existingProduct.setPrice(newProductDetails.getPrice());

        return repo.save(existingProduct);
    }

    @Override
    public void deleteproduct(int id) {
        repo.deleteById(id);
    }
}
