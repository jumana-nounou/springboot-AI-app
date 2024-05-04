package com.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.entity.Device;

public interface DeviceRepository extends MongoRepository<Device, Long> {

    List<Device> findAll();

    Optional<Device> findById(Long id);

    Device save(Device device);
    
}