package br.com.adriano.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.adriano.forum.controller.dto.TopicoDto;
import br.com.adriano.forum.modelo.Curso;
import br.com.adriano.forum.modelo.Topico;
import br.com.adriano.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista(String nomeCurso){
		System.out.println(nomeCurso);
		List<Topico> topicos = topicoRepository.findByCurso_Nome(nomeCurso);
		return Topico.converter(topicos);			
	}
}
