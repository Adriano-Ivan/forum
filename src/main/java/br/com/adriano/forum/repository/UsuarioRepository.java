package br.com.adriano.forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adriano.forum.modelo.Usuario;

public interface UsuarioRepository extends
	JpaRepository<Usuario,Long>{
	Optional<Usuario> findByEmail(String email);
}
