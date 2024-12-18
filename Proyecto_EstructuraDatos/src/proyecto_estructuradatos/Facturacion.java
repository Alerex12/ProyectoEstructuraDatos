
package proyecto_estructuradatos;
import java.time.LocalDate;
import java.time.LocalTime;

public class Facturacion {
    private double pago;
    private LocalDate fecha;
    private LocalTime hora;//averiguar si se puede usar LocalTime 
    private String descripRutina;//aqui se guarda la descripcion de la rutina
    private String nombreCliente;
    private Estado Est;


    public Facturacion() {
        this.pago = 0.00;
        this.fecha = null;
        this.hora = null;
        this.descripRutina ="";
        this.nombreCliente ="";
        this.Est= Estado.ACTIVO;//podria ir en activo pero idk
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
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
