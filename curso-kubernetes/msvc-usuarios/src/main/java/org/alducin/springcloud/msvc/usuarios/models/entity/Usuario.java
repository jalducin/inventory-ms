package org.alducin.springcloud.msvc.usuarios.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    @Column(unique = true)
    private String email;

    private String password;

}
