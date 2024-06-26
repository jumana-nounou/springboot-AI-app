package com.entity.repository;

import com.entity.Device;
import com.mongodb.lang.NonNull;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceRepository extends MongoRepository<Device, Integer> {

    <S extends Device> S save(@NonNull S device);

    Optional<Device> findById( Integer _id);

    boolean existsById(Integer _id);

    List<Device> findAll();

    void deleteById(Integer _id);
}