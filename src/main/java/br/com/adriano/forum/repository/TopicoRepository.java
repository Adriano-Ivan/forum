package br.com.adriano.forum.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.adriano.forum.modelo.Topico;

@Repository
public interface TopicoRepository extends
	JpaRepository<Topico, Long>{
	Page<Topico> findByCurso_Nome(String nomeCurso,
			Pageable paginacao);
	
	@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
	List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso")String nomeCurso
			);
}
