package dibe.develop.marketplace.service.impl;

import dibe.develop.marketplace.entity.Vehicle;
import dibe.develop.marketplace.repository.VehicleRepository;
import dibe.develop.marketplace.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public List<Vehicle> findAll() {
        return (List<Vehicle>) this.vehicleRepository.findAll();
    }

    @Override
    public void save(Vehicle v) {
        this.vehicleRepository.save(v);
    }

    @Override
    public Long delete(Vehicle v) {
        Long ret = v.getId();
        this.vehicleRepository.delete(v);
        return ret;
    }
}
