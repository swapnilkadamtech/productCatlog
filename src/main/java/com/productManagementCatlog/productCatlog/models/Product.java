package com.productManagementCatlog.productCatlog.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    private String name;
    private String description;
    private String image;
    private Double price;
    private Category category;
}
