package com.controller;

import org.springframework.web.bind.annotation.*;
import com.entity.Device;
import com.repository.DeviceRepository;
import com.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private DeviceService deviceService;

    @GetMapping
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    @PostMapping("/predict/{deviceId}")
    public Device predictPrice(@PathVariable String deviceId) {
        Device device = deviceRepository.findById(deviceId).orElse(null);
        if (device == null) {
            System.out.println("Device does not exist!");;
        }
    
        double predictedPrice = deviceService.getPredictedPrice(device);
    
        device.setPredictedPrice(predictedPrice);
    
        deviceRepository.save(device);
    
        return device;
    }

    @PostMapping("/predict")
    public Device predictPrice(@RequestBody Device device) {
    device = deviceRepository.save(device);

    double predictedPrice = deviceService.getPredictedPrice(device);

    device.setPredictedPrice(predictedPrice);

    deviceRepository.save(device);

    return device;
}
//     @PostMapping
//     public Device createDevice(@RequestBody Device device) {
//     return deviceRepository.save(device);
// }
}