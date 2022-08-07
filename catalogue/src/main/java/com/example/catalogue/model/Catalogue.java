package com.example.catalogue.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="catalogue_table")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
public class Catalogue {


    @Id
    @GeneratedValue
    int id;
    private String category;
    private String itemName;
}
