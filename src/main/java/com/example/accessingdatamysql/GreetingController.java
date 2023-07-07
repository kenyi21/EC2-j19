package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "a18102742, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/codigo-nombre")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "kenyi") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));		
	}
}


@RestController
public class GreetingController {

	private static final String template = "a18102742, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/codigoidat")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "a18104242") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));		
	}
}


@RestController
public class GreetingController {

	private static final String template = "kenyi, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/nombrecompleto")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "tirado castañeda") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));		
	}
}