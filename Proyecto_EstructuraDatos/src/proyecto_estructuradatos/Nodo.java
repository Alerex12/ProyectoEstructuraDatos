package proyecto_estructuradatos;

public class Nodo {
    private Nodo siguiente;
    private Usuario usuario;

    public Nodo(Usuario usuario) {
        this.siguiente = null;
        this.usuario = usuario;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}