package com.example.catalogue.common;

import com.example.catalogue.model.Catalogue;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatalogueRequest {

    private Catalogue catalogue;
    private Order order;

}
