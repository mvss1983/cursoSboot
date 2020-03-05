package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.model.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
public class TopicoController {
	
	@Autowired
	private TopicoRepository topicoRepository;

	@RequestMapping("/topicos")
	//@ResponseBody  não precisa declara caso a anotação da classe seja @RestController
	public List<TopicoDto> lista(String nomeCurso){
		
		if(nomeCurso == null) {
			
			List<Topico> topicos = topicoRepository.findAll();  //usando método findAll() do topicoRepository para pegar todos os registros.
			return TopicoDto.converter(topicos);
			
		}else{	
			
			List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);			
			return TopicoDto.converter(topicos);
		}	
		
	}
	
}
