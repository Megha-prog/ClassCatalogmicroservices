package com.example.catalogue.controller;

import com.example.catalogue.common.CatalogueRequest;
import com.example.catalogue.common.CatalogueResponse;
import com.example.catalogue.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalogue")
public class CatalogueController {

    @Autowired
    CatalogueService catalogueService;

    @PostMapping("/purchase")
    public CatalogueResponse createPurchase(@RequestBody CatalogueRequest catalogueRequest) {
        return catalogueService.createPurchase(catalogueRequest);

    }
}
