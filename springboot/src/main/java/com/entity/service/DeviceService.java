package com.entity.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.entity.Device;

@Service
public class DeviceService {

    public double getPredictedPrice(Device device) {
        RestTemplate restTemplate = new RestTemplate();
    
        HttpEntity<Device> requestEntity = new HttpEntity<>(device);
    
        ResponseEntity<Device> responseEntity = restTemplate.exchange(
            "http://localhost:5000/predict",
            HttpMethod.POST,
            requestEntity,
            Device.class
        );
    
        return responseEntity.getBody().getPriceRange();
    }
}