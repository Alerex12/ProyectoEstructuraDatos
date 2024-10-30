package proyecto_estructuradatos;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String nombreUsuario;
    private String clave;
    private Estado estado;

    public Usuario() {
        this.nombre = " ";
        this.apellidos = " ";
        this.nombreUsuario =" ";
        this.clave = " ";
        this.estado = Estado.ACTIVO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", nombreUsuario=" + nombreUsuario
                + ", clave=" + clave + ", estado=" + estado + "]";
    }
}
