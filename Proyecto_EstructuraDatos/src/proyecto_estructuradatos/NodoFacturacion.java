
package proyecto_estructuradatos;

public class NodoFacturacion {
    private Facturacion elemento;
    private NodoFacturacion siguiente;

    public NodoFacturacion() {
        this.siguiente = null;
    }

    public Facturacion getElemento() {
        return elemento;
    }

    public void setElemento(Facturacion elemento) {
        this.elemento = elemento;
    }

    public NodoFacturacion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoFacturacion siguiente) {
        this.siguiente = siguiente;
    }
      
}
