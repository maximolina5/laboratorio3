/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrenadores;

/**
 *
 * @author maxim
 */
public class entrenador {
    private int idEntrenador;
    private String nombre;
    private String tipo;
    static int contadorEntrenadores;

    public entrenador() {
    }
    entrenador (String nombre, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
        this.idEntrenador=++contadorEntrenadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
