package org.example.ayudas;

import java.time.LocalDate;

public class Licor {

     private String nombre;
    private String marca;

    private String tipo;

    private LocalDate fechaCaducidad;

    private Double porcnetajeAlcohol;

    public Licor() {
    }

    public Licor(String nombre, String marca, String tipo, LocalDate fechaCaducidad, Double porcnetajeAlcohol) {
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.fechaCaducidad = fechaCaducidad;
        this.porcnetajeAlcohol = porcnetajeAlcohol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Double getPorcnetajeAlcohol() {
        return porcnetajeAlcohol;
    }

    public void setPorcnetajeAlcohol(Double porcnetajeAlcohol) {
        this.porcnetajeAlcohol = porcnetajeAlcohol;
    }
}
