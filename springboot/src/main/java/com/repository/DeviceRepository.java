package com.repository;

import com.entity.Device;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceRepository extends MongoRepository<Device, Long> {

    <S extends Device> S save(S device);

    Optional<Device> findById(String id);

    boolean existsById(String id);

    List<Device> findAll();

    void deleteById(String id);
}