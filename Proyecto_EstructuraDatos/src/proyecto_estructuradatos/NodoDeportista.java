
package proyecto_estructuradatos;

public class NodoDeportista {
    private Deportista elemento;
    private NodoDeportista siguiente;

    public NodoDeportista() {
        this.siguiente = null;
    }

    public Deportista getElemento() {
        return elemento;
    }

    public void setElemento(Deportista elemento) {
        this.elemento = elemento;
    }

    public NodoDeportista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDeportista siguiente) {
        this.siguiente = siguiente;
    }
}
