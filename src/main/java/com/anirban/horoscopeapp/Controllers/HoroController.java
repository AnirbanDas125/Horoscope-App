package com.anirban.HoroscopeApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anirban.HoroscopeApp.Services.HoroService;

@RestController
@RequestMapping("/get-horoscope")
public class HoroController {

	@Autowired
	private HoroService service;
	
	@GetMapping("/{period}/{sign}")
	public String getHoroscope(@PathVariable String period, @PathVariable String sign) {
		return service.getHoroscope(period,sign);
	}
}
