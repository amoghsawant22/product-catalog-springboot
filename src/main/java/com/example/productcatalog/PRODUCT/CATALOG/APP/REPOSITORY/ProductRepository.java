package com.example.productcatalog.PRODUCT.CATALOG.APP.REPOSITORY;

import com.example.productcatalog.PRODUCT.CATALOG.APP.ENTITY.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product,Long> {

}
