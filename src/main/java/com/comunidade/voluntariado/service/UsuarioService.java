package com.comunidade.voluntariado.service;

import com.comunidade.voluntariado.dto.UsuarioDTO;
import com.comunidade.voluntariado.model.Usuario;
import com.comunidade.voluntariado.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario criar(UsuarioDTO dto) {
        Usuario u = new Usuario();
        u.setNome(dto.getNome());
        u.setEmail(dto.getEmail());
        return usuarioRepository.save(u);
    }
}
