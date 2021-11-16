package com.franksAPI.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.franksAPI.models.Quote;

@RestController
public class MainController {
	
	@Autowired
    RestTemplate restTemp;

	
	@GetMapping("/")
	public String stuff() {
		String baseUrl = "https://quoters.apps.pcfone.io/api/random";
		Quote oneQuote=restTemp.getForObject(baseUrl ,Quote.class);

		return oneQuote.toString();
	}
	
//	OkHttpClient client = new OkHttpClient();
//
//	Request request = new Request.Builder()
//	  .url("https://quoters.apps.pcfone.io/api/random\r\n")
//	  .get()
//	  .addHeader("Accept", "application/json")
//	  .addHeader("Authorization", "Bearer [token goes here]")
//	  .build();
//
//	Response response = client.newCall(request).execute();

}
