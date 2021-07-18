package com.springboot.prueba;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorRest {

	private static final Logger LOGGER = LoggerFactory.getLogger(ControladorRest.class);

	@GetMapping(path = "/imprimir-nombre")
	public ResponseEntity<String> imprimirNombre(@RequestParam String nombre, HttpServletRequest hsrt){
	
		LOGGER.info("Id Usuario Remoto: {} , Nombre Host: {}, Consulta: {}", hsrt.getRemoteAddr(), hsrt.getRemoteHost(), nombre);

		return new ResponseEntity<>("Tu nombre es: "+nombre , HttpStatus.OK);
	}

	
	@GetMapping(path = "/obtener-fecha")
	public ResponseEntity<String> consultafecha(HttpServletRequest hsrt){
	
		LOGGER.info("Id Usuario Remoto: {} , Nombre Host: {}", hsrt.getRemoteAddr(), hsrt.getRemoteHost());

		return new ResponseEntity<>("La fecha actual es: "+ new Date().toString() , HttpStatus.OK);
	}
}
