package com.example.catalogue.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    int id;
    private String name;
    private double price;
    private int qty;
    private String catalogueCategory;
    private String catalogueItemName;

}
