package com.codingdojo.TheCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CodeCtrl {
	@RequestMapping("/")
	public String index() {
		return "/TheCode/index.jsp";
	}

}
