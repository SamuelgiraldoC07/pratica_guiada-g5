package org.example;

import org.example.ayudas.Licor;
import org.example.modelos.Clientes;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Licor licorUno = new Licor();
        Licor licorDos = new Licor("Aguardiente antioqueño tapa verde","aguardiente","FLA", LocalDate.of(2028,10,31),29.0);

        Clientes clientesuno = new Clientes();

        Clientes clientesDos = new Clientes("Samuel","1023631950",17,"Calle 99 #75a 033","Samuelciro@gmail.com");

        //accediendo a los atributos
        System.out.println(licorUno.getNombre());
        System.out.println(licorDos.getNombre());
    }

}