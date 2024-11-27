
package proyecto_estructuradatos;

public class NodoDeportista {
    private Deportista elemento;
    private NodoDeportista siguiente;
    private NodoDeportista anterior;

    public NodoDeportista() {
        this.siguiente = null;
        this.anterior = null;
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

    public NodoDeportista getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDeportista anterior) {
        this.anterior = anterior;
    }

}
