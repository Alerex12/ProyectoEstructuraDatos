package proyecto_estructuradatos;

public class PadresDeFamilia {
    private String nombrePadre;
    private String apellidosPadre;
    private String nombreHijo;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String correo;
    private Estado estado;

    public PadresDeFamilia() {
        this.nombrePadre = "";
        this.apellidosPadre = "";
        this.nombreHijo ="";
        this.ciudad = "";
        this.direccion = "";
        this.telefono = "";
        this.correo = "";
        this.estado = Estado.ACTIVO;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getApellidosPadre() {
        return apellidosPadre;
    }

    public void setApellidosPadre(String apellidosPadre) {
        this.apellidosPadre = apellidosPadre;
    }

    public String getNombreHijo() {
        return nombreHijo;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
