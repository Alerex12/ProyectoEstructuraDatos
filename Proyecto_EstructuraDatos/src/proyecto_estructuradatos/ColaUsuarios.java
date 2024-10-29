/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estructuradatos;

/**
 *
 * @author Gabo
 */
public class ColaUsuarios {
    private Nodo inicio; 
    private Nodo fin;    
    // Constructor
    public ColaUsuarios() {
        this.inicio = null;
        this.fin = null;
    }

    
    public void encolarUsuario(Usuario nuevoUsuario) {
        Nodo nuevoNodo = new Nodo(nuevoUsuario);
        
        if (inicio == null) {  
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo); 
            fin = nuevoNodo; 
        }
        System.out.println("Usuario encolado: " + nuevoUsuario.getNombre() + " " + nuevoUsuario.getApellidos());
    }
}

