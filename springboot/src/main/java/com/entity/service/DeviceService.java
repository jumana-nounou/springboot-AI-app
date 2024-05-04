package com.entity.service;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.entity.Device;
import java.util.Map;
import java.util.List;

@Service
public class DeviceService {

    public double getPredictedPrice(Device device) {
        RestTemplate restTemplate = new RestTemplate();
    
        HttpEntity<Device> requestEntity = new HttpEntity<>(device);
    
        ResponseEntity<Map<String, List<Double>>> responseEntity = restTemplate.exchange(
            "http://127.0.0.1:5000/predict",
            HttpMethod.POST,
            requestEntity,
            new ParameterizedTypeReference<Map<String, List<Double>>>() {}
        );
    
        List<Double> predictedPriceList = responseEntity.getBody().get("predictedPrice");
        if (!predictedPriceList.isEmpty()) {
            return predictedPriceList.get(0);
        } else {
            throw new RuntimeException("Predicted price list is empty");
        }
    }
}