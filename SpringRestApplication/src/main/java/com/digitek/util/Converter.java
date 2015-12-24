package com.digitek.util;

import java.io.File;
import java.io.IOException;

import com.digitek.model.Customer;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Converter {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		javaToJson();
	}
	
	public static void javaToJson() throws JsonGenerationException, JsonMappingException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		Customer obj = new Customer();
		obj.setNo(1);
		obj.setName("Cust1");

		//Object to JSON in String
		String jsonInString = mapper.writeValueAsString(obj);
		
		System.out.println("customer json:" + jsonInString);

		
		
	}

}
