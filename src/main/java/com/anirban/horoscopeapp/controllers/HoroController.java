package com.anirban.horoscopeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.anirban.horoscopeapp.services.HoroService;


@RestController
public class HoroController {
	
	@Autowired
	private HoroService service;
	

}
