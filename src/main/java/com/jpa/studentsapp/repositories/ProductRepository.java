package com.jpa.studentsapp.repositories;
import com.jpa.studentsapp.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<product,Long> {

    List<product> findByNameContains(String mc);
    List<product> findByPriceGreaterThan(double price);
    @Query("select p from product p where p.name like :x")
    List<product> search(@Param("x") String mc);

    @Query("select p from product p where p.price>:x")
    List<product> searchByPrice(@Param("x") double price);

}
