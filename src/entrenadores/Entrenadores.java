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
public class Entrenadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        entrenador s = new entrenador("pepe","tennis");
        s.getNombre();
        s.getTipo();
        System.out.println("id: "+entrenador.contadorEntrenadores+"\tNombre "+s.getNombre()+"\tTipo "+s.getTipo());
        entrenador j = new entrenador("Elvio","Futbol");
        j.getNombre();
        j.getTipo();
        System.out.println("id: "+entrenador.contadorEntrenadores+"\tNombre "+j.getNombre()+"\tTipo "+j.getTipo());
        entrenador g = new entrenador("Franco","tennis");
        g.getNombre();
        g.getTipo();
        System.out.println("id: "+entrenador.contadorEntrenadores+"\tNombre "+g.getNombre()+"\tTipo "+g.getTipo());
        entrenador l = new entrenador("Jaime","voley");
        l.getNombre();
        l.getTipo();
        System.out.println("id: "+entrenador.contadorEntrenadores+"\tNombre "+l.getNombre()+"\tTipo "+l.getTipo());
        entrenador h = new entrenador("Gaby","gimnasia artistica");
        h.getNombre();
        h.getTipo();
        System.out.println("id: "+entrenador.contadorEntrenadores+"\tNombre "+h.getNombre()+"\tTipo "+h.getTipo());
    }
    
}
