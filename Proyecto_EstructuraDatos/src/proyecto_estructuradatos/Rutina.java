
package proyecto_estructuradatos;


public class Rutina {
    private int idRutina;
    private Deportes deportePerteneciente; 
    private String descripcion;
    private int duracion; // En minutos
    private Estado estado;

    public Rutina() {
        this.idRutina = 0;
        this.deportePerteneciente = null;
        this.descripcion = "";
        this.duracion = 0;
        this.estado = Estado.ACTIVO;
    }

    public Deportes getDeportePerteneciente() {
        return deportePerteneciente;
    }

    public void setDeportePerteneciente(Deportes deportePerteneciente) {
        this.deportePerteneciente = deportePerteneciente;
    }
    

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    } 
    
    @Override
    public String toString(){
        return this.idRutina+" "+this.descripcion+" "+
               this.deportePerteneciente+" "+this.duracion+" "+this.estado;
    
    }
}

