package proyecto_estructuradatos;

public class NodoPadresDeFamilia {
    private PadresDeFamilia elemento;
    private NodoPadresDeFamilia siguiente;

    public NodoPadresDeFamilia() {
        this.siguiente = null;
    }

    public PadresDeFamilia getElemento() {
        return elemento;
    }

    public void setElemento(PadresDeFamilia elemento) {
        this.elemento = elemento;
    }

    public NodoPadresDeFamilia getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPadresDeFamilia siguiente) {
        this.siguiente = siguiente;
    }

}
