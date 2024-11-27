package proyecto_estructuradatos;


public class Deportes {
/* Catálogo
de Deportes (nombre del deporte,
características y estado),
 */
    private String deporte;
    private String características;
    private Estado estado;

    public Deportes() {
        this.deporte = "";
        this.características = "";
        this.estado = estado.ACTIVO;
    }

    
 
    public String getCaracterísticas() { return características;
    }

    public Estado getEstado() {return estado;
    }


    public String getDeporte() { return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void setCaracterísticas(String características) {
        this.características = características;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}