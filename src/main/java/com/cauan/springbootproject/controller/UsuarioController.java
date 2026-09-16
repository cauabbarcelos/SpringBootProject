package com.cauan.springbootproject.controller;

import com.cauan.springbootproject.business.UsuarioService;
import com.cauan.springbootproject.infraestructure.entities.Usuario;
import com.cauan.springbootproject.infraestructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> salvarUsario(@RequestBody Usuario usuario) {
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<Usuario> buscarUsuarioPorId(@RequestParam Integer id) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorId(id ));
    }
    @DeleteMapping
    public ResponseEntity<Void> deletarUsuarioPorId(@RequestParam Integer id) {
        usuarioService.deleteUsuarioPorId(id);
        return ResponseEntity.ok().build();
    }
    @PutMapping
    public ResponseEntity<Void>  atualizarUsuarioPorId(@RequestParam Integer id, @RequestBody Usuario usuario) {
        usuarioService.atualizarUsuarioPorId(id , usuario);
        return ResponseEntity.ok().build();
    }
}