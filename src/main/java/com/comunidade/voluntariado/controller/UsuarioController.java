package com.comunidade.voluntariado.controller;

import com.comunidade.voluntariado.dto.UsuarioDTO;
import com.comunidade.voluntariado.model.Usuario;
import com.comunidade.voluntariado.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioService.listarTodos();
    }

    @PostMapping
    public ResponseEntity<Usuario> criar(@RequestBody UsuarioDTO dto) {
        Usuario criado = usuarioService.criar(dto);
        return ResponseEntity.ok(criado);
    }
}
