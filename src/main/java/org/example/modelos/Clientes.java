package org.example.modelos;

public class Clientes {

    private String nombre;
    private String documentoIdentificacion;
    private Integer edad;
    private String direccion;
    private String correo;

    public Clientes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(String documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Clientes(String nombre, String documentoIdentificacion, Integer edad, String direccion, String correo) {
        this.nombre = nombre;
        this.documentoIdentificacion = documentoIdentificacion;
        this.edad = edad;
        this.direccion = direccion;
        this.correo = correo;

    }
}
