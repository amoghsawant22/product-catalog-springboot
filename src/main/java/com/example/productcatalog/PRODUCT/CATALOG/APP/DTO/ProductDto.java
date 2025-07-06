package com.example.productcatalog.PRODUCT.CATALOG.APP.DTO;

import com.example.productcatalog.PRODUCT.CATALOG.APP.ENTITY.Product;

public class ProductDto {

    private Long id;
    private String name;
    private String Category;
    private double price;

    public ProductDto() {}

    public ProductDto(Long id,String name,String Category,double price ) {
        this.id= id;
        this.price = price;
        this.Category = Category;
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

