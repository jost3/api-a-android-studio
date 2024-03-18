package com.example.api1.model;

public class movie {
    private int id;
    private String nombre;
    private String cataegoria;
    private String estado;
    private String descripcion;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCataegoria() {
        return cataegoria;
    }

    public void setCataegoria(String cataegoria) {
        this.cataegoria = cataegoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
