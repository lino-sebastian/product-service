package com.post.meridiem.service;

import com.post.meridiem.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService {

    @Value("${product.mock.url}")
    private String productMockURL;

    @Autowired
    private RestTemplate restTemplate;

    public List<Products> getProducts(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(List.of(MediaType.APPLICATION_JSON));
        HttpEntity<List<Products>> httpEntity = new HttpEntity<>(headers);
        return restTemplate.exchange(productMockURL, HttpMethod.GET, httpEntity, List.class).getBody();
    }
}
