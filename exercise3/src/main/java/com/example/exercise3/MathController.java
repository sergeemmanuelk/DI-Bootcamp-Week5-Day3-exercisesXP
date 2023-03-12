package com.example.exercise3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
	@GetMapping("/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
	    return a + b;
	}

	@GetMapping("/subtract/{a}/{b}")
	public int subtract(@PathVariable int a, @PathVariable int b) {
	    return a - b;
	}

	@GetMapping("/multiply/{a}/{b}")
	public int multiply(@PathVariable int a, @PathVariable int b) {
	    return a * b;
	}

	@GetMapping("/divide/{a}/{b}")
	public double divide(@PathVariable int a, @PathVariable int b) {
	    if (b == 0) {
	        throw new IllegalArgumentException("Divisor cannot be zero");
	    }
	    return (double) a / b;
	}


}
