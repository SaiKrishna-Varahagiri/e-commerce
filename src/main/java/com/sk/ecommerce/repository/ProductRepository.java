package com.sk.ecommerce.repository;

import com.sk.ecommerce.po.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "Products", path="products")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
