package com.MajorEComm.major.dto;

import com.MajorEComm.major.model.Category;
import lombok.Data;

@Data
public class ProductDTO {
    private long id;
    private String Name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
