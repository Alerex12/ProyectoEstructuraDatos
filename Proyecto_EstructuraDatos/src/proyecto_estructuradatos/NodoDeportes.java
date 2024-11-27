package proyecto_estructuradatos;

public class NodoDeportes {
    private Deportes elemento;
    private NodoDeportes siguiente;

    public NodoDeportes() {
        this.siguiente = null;
    }

    public Deportes getElemento() {
        return elemento;
    }

    public void setElemento(Deportes elemento) {
        this.elemento = elemento;
    }

    public NodoDeportes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDeportes siguiente) {
        this.siguiente = siguiente;
    }
}
