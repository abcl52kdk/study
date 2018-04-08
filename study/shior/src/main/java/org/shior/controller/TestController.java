package org.shior.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("ts")	
	public String t(@RequestParam("s") String s) {
		return s;
	}
}
