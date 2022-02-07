package br.com.adriano.forum.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.adriano.forum.modelo.Curso;

@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class CursoRepositoryTest {
	
	@Autowired
	private CursoRepository repository;
	
	/*
	 @Autowired
	 private TestEntityManager em;
	 */
	
	@Test
	public void deveriaCarregarUmCursoAoBuscarPeloSeuNome() {
		String nomeCurso = "HTML 5"; 
		
		/*
		 Curso curso = new Curso();
		 curso.setNome("HTML 5");
		 curso.setCategoria("Front-end");
		 em.persist(curso);
		 */
		
		Curso curso = repository.findByNome(nomeCurso);
		
		assertNotNull(curso);
		assertEquals(nomeCurso, curso.getNome());
	}

	@Test
	public void naoDeveriaCarregarUmCursoAoBuscarPeloSeuNome() {
		String nomeCurso = "JPA"; 
		
		Curso curso = repository.findByNome(nomeCurso);
		
		assertNull(curso);
	}
}
