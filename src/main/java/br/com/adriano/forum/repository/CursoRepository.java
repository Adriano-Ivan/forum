package br.com.adriano.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adriano.forum.modelo.Curso;

public interface CursoRepository extends
	JpaRepository<Curso, Long>{
	Curso findByNome(String nome);
}
