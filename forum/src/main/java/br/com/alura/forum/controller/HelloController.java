package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	@RequestMapping("/")
	@ResponseBody  //retorna string direto para o navegador
	public String hello()	{
	
		return "Hello Word!";
	}
}
