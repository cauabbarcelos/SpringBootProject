package com.cauan.springbootproject.controller;

import com.cauan.springbootproject.business.UsuarioService;
import com.cauan.springbootproject.infraestructure.entities.Usuario;
import com.cauan.springbootproject.infraestructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> salvarUsario(@RequestBody Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam Integer id) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorId(id ));
    }
    @DeleteMapping
    public ResponseEntity<Usuario> deletarUsuarioPorId(@RequestParam Integer id) {
        usuarioService.deleteUsuarioPorId(id);
        return ResponseEntity.ok().build();
    }
}