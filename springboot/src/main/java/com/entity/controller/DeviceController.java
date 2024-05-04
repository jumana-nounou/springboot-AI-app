package com.entity.controller;

import org.springframework.web.bind.annotation.*;
import com.entity.Device;
import com.entity.repository.DeviceRepository;
import com.entity.service.DeviceService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private DeviceService deviceService;

    // Get all devices
    @GetMapping
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    // Get device by id
    @GetMapping("/{_id}")
    public ResponseEntity<?> getDeviceById(@PathVariable Integer _id) {
      Optional<Device> deviceOptional = deviceRepository.findById(_id);
      if (!deviceOptional.isPresent()) {
        return new ResponseEntity<>("Device does not exist", HttpStatus.OK);
      }
     return new ResponseEntity<>(deviceOptional.get(), HttpStatus.OK);
}
 
// Create a new device
    @PostMapping("/create")
    public Device createDevice(@RequestBody Device device) {
    return deviceRepository.save(device);
}

@PostMapping("/predict/{_id}")
public ResponseEntity<?> predictPrice(@PathVariable Integer _id) {
    Optional<Device> deviceOptional = deviceRepository.findById(_id);
    if (!deviceOptional.isPresent()) {
        return new ResponseEntity<>("Device does not exist", HttpStatus.OK);
    }
    Device device = deviceOptional.get();
    double predictedPrice = deviceService.getPredictedPrice(device);
    device.setPriceRange((int) predictedPrice);
    deviceRepository.save(device);
    return new ResponseEntity<>(device.getPriceRange(), HttpStatus.OK);
}

}