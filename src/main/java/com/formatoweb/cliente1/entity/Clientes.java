package com.formatoweb.cliente1.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Clientes {
    private Long id;
    private String nombre;
    private Integer edad;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "edad", nullable = false)
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clientes clientes = (Clientes) o;
        return Objects.equals(id, clientes.id) && Objects.equals(nombre, clientes.nombre) && Objects.equals(edad, clientes.edad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, edad);
    }
}
