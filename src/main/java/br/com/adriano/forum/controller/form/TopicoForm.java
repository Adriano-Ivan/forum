package br.com.adriano.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.adriano.forum.modelo.Curso;
import br.com.adriano.forum.modelo.Topico;
import br.com.adriano.forum.repository.CursoRepository;
import br.com.adriano.forum.repository.TopicoRepository;

public class TopicoForm {

	@NotNull @NotEmpty @Size(min=5)
	private String titulo;
	
	@NotNull @NotEmpty @Size(min=10)
	private String mensagem;
	
	@NotNull @NotEmpty 
	private String nomeCurso;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public Topico converter(CursoRepository repository) {
		Curso curso = repository.findByNome(nomeCurso);
		return new Topico(titulo,mensagem,curso);
	}
	
	
}
