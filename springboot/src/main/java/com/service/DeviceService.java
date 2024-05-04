package com.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.entity.Device;
import com.entity.Prediction;

@Service
public class DeviceService {

    public double getPredictedPrice(Device device) {
        RestTemplate restTemplate = new RestTemplate();

        // Create an HttpEntity object with the device as the body
        HttpEntity<Device> requestEntity = new HttpEntity<>(device);

        // Make the POST request
        ResponseEntity<Prediction> responseEntity = restTemplate.exchange(
            "http://localhost:5000/predict",
            HttpMethod.POST,
            requestEntity,
            Prediction.class
        );

        // Get the predicted price from the response
        return responseEntity.getBody().getPredictedPrice();
    }
}