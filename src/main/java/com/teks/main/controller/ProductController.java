package com.teks.main.controller;

import com.teks.main.entity.Product;
import com.teks.main.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }

    @GetMapping("/allproducts")
    public List<Product> getAllproducts(){
       return service.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById( @PathVariable int id){
        return service.getProductById(id);
    }


    @PutMapping("/updateproduct/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product newProductDetails){
        return service.updateProduct(id,newProductDetails);
    }


    @DeleteMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable int id){
        service.deleteproduct(id);

        return "Product deleted Successful";
    }
}
