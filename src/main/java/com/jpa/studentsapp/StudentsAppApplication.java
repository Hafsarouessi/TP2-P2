package com.jpa.studentsapp;

import com.jpa.studentsapp.entities.product;
import com.jpa.studentsapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentsAppApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {

        SpringApplication.run(StudentsAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new product(null,"Computer",4300,3));
        productRepository.save(new product(null,"Printer",1200,4));
        productRepository.save(new product(null,"Smart phone",3200,32));
        List<product> products =productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString()+"hello");
        });



    }

}
