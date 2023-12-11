package com.anirban.HoroscopeApp.Services;

import org.springframework.stereotype.Service;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

@Service
public class HoroService {

	private String baseUrl = "https://horoscopes-ai.p.rapidapi.com/get_horoscope_en/";
	
	public String getHoroscope(String period, String sign) {
		baseUrl = baseUrl+period+"/"+sign+"/general";
		
		try{
		  HttpResponse<String> response = Unirest.get(baseUrl)
				  .header("X-RapidAPI-Key", "<YOUR-API-KEY>")
				  .header("X-RapidAPI-Host", "<YOUR-API-HOSTNAME>")
				  .asString();
		  
		  return response.getBody();
		}catch(Exception e) {
			e.printStackTrace();
			return "Something went wrong.."+e.getMessage();
		}
	}

}
