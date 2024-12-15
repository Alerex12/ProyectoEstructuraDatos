
package proyecto_estructuradatos;

import javax.swing.JOptionPane;

public class Funcion_Facturacion {
    
   private NodoFacturacion inicio;
   private NodoFacturacion fin;

    public Funcion_Facturacion() {
        this.inicio = null;
        this.fin = null;
    }
   
   
   
   public void crearFactura(Rutina rutina, Usuario usuario){
       
   }


     public boolean esVaciaSC() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
       public void mostrarFactura() {// Opcion 1 muestra todas las personas que han comprado y sus descripciones
        if (!esVaciaSC()) {
            String s = "";
            NodoFacturacion aux = inicio;
            s = s + aux.getElemento().getDescripRutina()+ "-->"+ aux.getElemento().getNombreCliente()+ "-->";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                s =s + aux.getElemento().getDescripRutina()+ "-->"+ aux.getElemento().getNombreCliente()+ "-->";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista simple circular contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "¡No se puede mostrar lista vacía!");
        }
    }

    public void mostrarFacturaOpcion2() {
        if (!esVaciaSC()) {
            String usuarioBuscar = JOptionPane.showInputDialog(null, "digite el usuario a buscar");
            String s = "";
            NodoFacturacion aux = inicio;
            while (aux != null) {
                if (usuarioBuscar.equals(aux.getElemento().getNombreCliente())) {
                    s = "Nombre: " + aux.getElemento().getNombreCliente()
                            + "\n, Rutina a hacer: " + aux.getElemento().getDescripRutina()
                            + "\n, Pago: " + aux.getElemento().getPago()
                            + "\n, Fecha: " + aux.getElemento().getFecha()
                            + "\n, Hora: " + aux.getElemento().getHora()
                            + "\n, Estado: " + aux.getElemento().getEst() + "\n";
                }
                aux = aux.getSiguiente();

            }

            JOptionPane.showMessageDialog(null, "Los usuarios registrados son los siguientes: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuario registrados");

        }
    }

    public void Anular() {
        if (!esVaciaSC()) {
            String usuarioBuscar = JOptionPane.showInputDialog(null, "digite el usuario a buscar");
            String s = "";
            NodoFacturacion aux = inicio;
            while (aux != null) {
                if (usuarioBuscar.equals(aux.getElemento().getNombreCliente())) {
                    aux.getElemento().setEst(Estado.ANULADA);
                    s = "Nombre: " + aux.getElemento().getNombreCliente()
                            + "\n, Rutina a hacer: " + aux.getElemento().getDescripRutina()
                            + "\n, Pago: " + aux.getElemento().getPago()
                            + "\n, Fecha: " + aux.getElemento().getFecha()
                            + "\n, Hora: " + aux.getElemento().getHora()
                            + "\n, Estado: " + aux.getElemento().getEst() + "\n";
                }
                aux = aux.getSiguiente();

            }

            JOptionPane.showMessageDialog(null, "Los usuarios registrados son los siguientes: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuario registrados");

        }
    }
}
