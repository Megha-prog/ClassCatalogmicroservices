package com.example.catalogue.repository;

import com.example.catalogue.model.Catalogue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatalogueRepository extends JpaRepository<Catalogue, Integer> {
        }

