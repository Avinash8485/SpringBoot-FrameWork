package com.jsp.spring.productdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.spring.productdb.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
