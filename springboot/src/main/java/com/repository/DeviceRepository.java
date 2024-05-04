package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {
    
}