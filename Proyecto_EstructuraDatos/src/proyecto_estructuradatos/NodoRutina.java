/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructura;

/**
 *
 * @author Gabo
 */
public class NodoRutina {
    private Rutina elemento;  // La clase Rutina que contendrá los datos.
    private NodoRutina siguiente;

    public Rutina getElemento() {
        return elemento;
    }

    public void setElemento(Rutina elemento) {
        this.elemento = elemento;
    }

    public NodoRutina getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRutina siguiente) {
        this.siguiente = siguiente;
    }
}

