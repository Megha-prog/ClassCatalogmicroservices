package com.example.catalogue.common;

import com.example.catalogue.model.Catalogue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatalogueResponse {
    private Catalogue catalogue;
    private double price;
    private int qty;
    private String message;




}
