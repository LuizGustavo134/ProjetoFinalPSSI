package com.comunidade.voluntariado.repository;

import com.comunidade.voluntariado.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
