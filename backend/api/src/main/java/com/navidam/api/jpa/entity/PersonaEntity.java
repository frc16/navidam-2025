package com.navidam.api.jpa.entity;

import jakarta.persistence.*;

@Entity
<<<<<<< HEAD
@Table(name="persona")
public class PersonaEntity{
=======
@Table(name = "personas")
public class PersonaEntity {
>>>>>>> dde7e55de22056f9f50b51cff740977d5ed68c5d
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    @Column(name="nombre")
    private String nombre;

    @Column(name="email")
    private String email;

=======
    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, unique = true, length = 255)
    private String email;

    //Constructores

>>>>>>> dde7e55de22056f9f50b51cff740977d5ed68c5d
    public PersonaEntity() {
    }

    public PersonaEntity(Long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

<<<<<<< HEAD
=======
    // Getters y Setters

>>>>>>> dde7e55de22056f9f50b51cff740977d5ed68c5d
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> dde7e55de22056f9f50b51cff740977d5ed68c5d
