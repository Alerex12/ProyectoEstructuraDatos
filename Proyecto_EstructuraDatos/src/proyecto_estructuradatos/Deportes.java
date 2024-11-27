package proyecto_estructuradatos;

public class Deportes {
    /*
     * Catálogo
     * de Deportes (nombre del deporte,
     * características y estado),
     */
    private String nombre;
    private String características;
    private Estado estado;

    public Deportes() {
        this.nombre = "";
        this.características = "";
        this.estado = Estado.ACTIVO;
    }

    public String getCaracterísticas() {
        return características;
    }

    public Estado getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCaracterísticas(String características) {
        this.características = características;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}