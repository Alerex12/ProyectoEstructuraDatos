/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoestructura;

/**
 *
 * @author Gabo
 */
public class Rutina {
    private String idRutina; 
    private String nombre;
    private String descripcion;
    private String nivel; 
    private int duracion; // En minutos
    private String identificacionDeportista;  // Identificación del deportista al que pertenece la rutina

    public String getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(String idRutina) {
        this.idRutina = idRutina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getIdentificacionDeportista() {
        return identificacionDeportista;
    }

    public void setIdentificacionDeportista(String identificacionDeportista) {
        this.identificacionDeportista = identificacionDeportista;
    }
}

