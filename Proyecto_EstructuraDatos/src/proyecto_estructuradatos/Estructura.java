/*Espacio para ideas o asuntos pendientes
 */
package proyecto_estructuradatos;

import javax.swing.JOptionPane;

/**
 *Aqui van las Listas
 */
public class Estructura {
    
    private NodoDeportes inicioDeportes;
    private NodoDeportes finDeportes;
//    private Nodo inicio;
//    private Nodo fin;

    public Estructura() {
        this.inicioDeportes = null;
        this.inicioDeportes = null;
    }

    public boolean esVaciaDeportes() {
        if (inicioDeportes == null) {
            return true;
        } else {
            return false;
        }
    }

    public void encolarDeportes() {
        Deportes nuevo = new Deportes();
        nuevo.setDeporte(JOptionPane.showInputDialog("Ingrese el deporte del niño: "));
        nuevo.setCaracterísticas(JOptionPane.showInputDialog("Ingrese las caracteristicas que tiene el deporte: "));
        NodoDeportes nuevoNodo = new NodoDeportes();
        nuevoNodo.setElemento(nuevo);
        
        if (inicioDeportes == null) {  
            inicioDeportes = nuevoNodo;
            finDeportes = nuevoNodo;
        } else {
            finDeportes.setSiguiente(nuevoNodo); 
            finDeportes = nuevoNodo; 
        }
        System.out.println("estado actual: " + nuevo.getDeporte()+ " " + nuevo.getCaracterísticas()+ " "+ nuevo.getEstado());
    }
    
  
}
