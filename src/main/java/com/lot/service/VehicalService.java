package com.lot.service;

import com.lot.model.Vehicle;

import java.util.List;

public interface VehicalService {
    List<Vehicle> findAllVehicles();
    Vehicle save(Vehicle vehicle);
}