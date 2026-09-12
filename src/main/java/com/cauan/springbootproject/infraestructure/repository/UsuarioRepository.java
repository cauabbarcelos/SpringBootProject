package com.cauan.springbootproject.infraestructure.repository;

import com.cauan.springbootproject.infraestructure.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
