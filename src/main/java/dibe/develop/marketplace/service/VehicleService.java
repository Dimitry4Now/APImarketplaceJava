package dibe.develop.marketplace.service;

import dibe.develop.marketplace.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> findAll();
    void save(Vehicle v);
    Long delete(Vehicle v);
}
