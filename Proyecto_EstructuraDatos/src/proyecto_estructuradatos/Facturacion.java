
package proyecto_estructuradatos;
import java.util.Date;

public class Facturacion {
    private double pago;
    private Date fecha;//averiguar si se puede usar LocalTime depende si el profe deja o no usarla
    private Date hora;//averiguar si se puede usar LocalTime 
    private String descripRutina;//aqui se guarda la descripcion de la rutina
    private String nombreCliente;
    private Estado Est;


    public Facturacion() {
        this.pago = 0;
        this.fecha = null;
        this.hora = null;
        this.descripRutina = null;
        this.nombreCliente = null;
        this.Est= null;//podria ir en activo pero idk
    }

    public Estado getEst() {
        return Est;
    }

    public void setEst(Estado Est) {
        this.Est = Est;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getDescripRutina() {
        return descripRutina;
    }

    public void setDescripRutina(String descripRutina) {
        this.descripRutina = descripRutina;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
   
}
