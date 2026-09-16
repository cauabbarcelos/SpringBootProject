package com.cauan.springbootproject.infraestructure.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity

public class Usuario {

    @Id
    @Column(name = "id" , unique = true, nullable = false)
    private Integer id;

    @Column(name = "email" , unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;
}
