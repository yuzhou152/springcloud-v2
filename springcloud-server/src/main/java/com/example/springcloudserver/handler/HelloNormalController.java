package com.example.springcloudserver.handler;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="normal")
public class HelloNormalController{

	@RequestMapping(value = "/hello-get", method = RequestMethod.GET)
	public String indexGet() {
		return "Hello World Get";
	}

	@RequestMapping(value = "/hello-post", method = RequestMethod.POST)
	public String indexPost(@RequestBody String data) {
		return "Hello World Post, data : " + data;
	}

	@RequestMapping(value = "/hello-header", method = RequestMethod.GET)
	public String indexHeader(@RequestHeader("data") String data) {
		return "Hello World Header, data : " + data;
	}
	

}
