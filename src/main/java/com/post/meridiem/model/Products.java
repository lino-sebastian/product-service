package com.post.meridiem.model;

import lombok.Data;

@Data
public class Products {
    private Integer id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
    private Rating rating;
}