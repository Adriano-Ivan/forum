package br.com.adriano.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.adriano.forum.modelo.Curso;
import br.com.adriano.forum.modelo.Topico;

@Controller
public class TopicosController {
	
	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> lista(){
		Topico t1 = new Topico("Dúvida","Dúvida com Spring",
				new Curso("Spring", "Programação"));
		
		return Arrays.asList(t1,t1,t1);
				
	}
}
