package com.groupmicroservice.productservice;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ProductServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
