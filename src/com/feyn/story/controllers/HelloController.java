package com.feyn.story.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloController {

	public @ResponseBody String sayHelloTo(@PathVariable(value = "name") String name)
	{
		return "Hello " + name;
	}
}
