package com.example.prometheusgrafana.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@SpringBootApplication
@Slf4j
public class PrometheusGrafanaController {

	@GetMapping("/log")
	public ResponseEntity<String> createLogs() {
		log.warn("Warning Log 123");
		log.info("Info Log 456");
		return ResponseEntity.ok().body("Success");
	}

}
