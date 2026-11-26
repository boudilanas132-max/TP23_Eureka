package com.example.car.models;

import com.example.car.entities.Client;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@Builder
public class CarResponse {

    private Long id;
    private String brand;
    private Client client;
    private String matricule;
    private String model;

    public CarResponse(Long id, String brand, Client client,
                       String matricule, String model) {
        this.id = id;
        this.brand = brand;
        this.client = client;
        this.matricule = matricule;
        this.model = model;
    }
}