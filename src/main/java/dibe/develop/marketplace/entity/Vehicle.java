package dibe.develop.marketplace.entity;

import dibe.develop.marketplace.enums.Body;
import dibe.develop.marketplace.enums.Transmission;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String make;
    private String model;
    private String color;
    private Transmission transmission;
    private String fuel;
    private int cubic;
    private int hp;
    private long ownerId;
    private int productionYear;
    private int kilometers;
    private String steering;
    private String description;
    private LocalDateTime registration;
    private String countryOfRegistration;
    private Body body;
    private String emissions;
    private double price;
    private Currency currency;
    private String VIN;
    public Vehicle(){}
}
