package com.digitek.client;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.digitek.model.Customer;

public class RestServiceClient {

	static String url = "http://localhost:8085/fetch/{id}";

	public static void main(String[] args) {
		restClient();
	}
	
	public static void restClient() {
		
		RestTemplate restTemplate = new RestTemplate();
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "100");
		ResponseEntity<Customer> customerEntity = restTemplate.getForEntity(url, Customer.class, map);
		System.out.println("Name:"+customerEntity.getBody().getName());
		System.out.println("No:"+customerEntity.getBody().getNo());   
		
	}

}
