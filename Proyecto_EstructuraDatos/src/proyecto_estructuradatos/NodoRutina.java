
package proyecto_estructuradatos;


public class NodoRutina {
    private Rutina elemento;  // La clase Rutina que contendrá los datos.
    private NodoRutina siguiente;

    public NodoRutina() {
        this.siguiente = null;
    }
    
    
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

