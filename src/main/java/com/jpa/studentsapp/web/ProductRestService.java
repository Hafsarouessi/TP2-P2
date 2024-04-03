package com.jpa.studentsapp.web;

import com.jpa.studentsapp.entities.product;
import com.jpa.studentsapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {
   @Autowired
    private ProductRepository ProductRepository;

    @GetMapping( "/products")
    public List<product> products(){
       return ProductRepository.findAll();
   }
    @GetMapping( "/products/{id}")
    public product findproducts(@PathVariable Long id){
        product Product =ProductRepository.findById(id).orElse(null);

        return Product ;
    }
}
