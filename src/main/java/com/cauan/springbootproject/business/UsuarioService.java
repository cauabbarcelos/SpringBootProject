package com.cauan.springbootproject.business;

import com.cauan.springbootproject.infraestructure.entities.Usuario;
import com.cauan.springbootproject.infraestructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public void salvarUsuario(Usuario usuario) {
        usuarioRepository.saveAndFlush(usuario);
    }
    public Usuario  buscarUsuarioPorId(Integer id){
        return usuarioRepository.findById(id).orElseThrow( () ->  new RuntimeException("Id Not Found"));
    }
    public void deleteUsuarioPorId(Integer id ) {
        usuarioRepository.deleteById(id);
    }
    public  void atualizarUsuarioPorId(Integer id, Usuario usuario) {

        Usuario  usuarioEntity = usuarioRepository.findById(id).orElseThrow( () ->  new RuntimeException("Id Not Found"));

        Usuario usuarioAtualizado = Usuario.builder()

                .id(usuarioEntity.getId())
                .nome(usuario.getNome() != null ? usuario.getNome() :  usuarioEntity.getNome())
                .email(usuarioEntity.getEmail())
                .build();

        usuarioRepository.saveAndFlush(usuarioAtualizado);
    }


}
