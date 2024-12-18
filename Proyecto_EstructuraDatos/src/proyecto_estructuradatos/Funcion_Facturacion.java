
package proyecto_estructuradatos;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class Funcion_Facturacion {
    
   private NodoFacturacion inicio;
   private NodoFacturacion fin;

    public Funcion_Facturacion() {
        this.inicio = null;
        this.fin = null;
    }
    
     public boolean esVaciaSC() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
     
     
    public void agregarFactura(NodoRutina rutinas, NodoPadresDeFamilia padres) {
        Facturacion factura = new Facturacion();
        NodoPadresDeFamilia aux = padres;
        NodoRutina aux2 = rutinas;

        String nomCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente (Nombre del padre): ");
        while (aux != null) {
            if (nomCliente.equals(aux.getElemento().getNombrePadre())) {
                factura.setNombreCliente(nomCliente);
                break;
            }

            aux = aux.getSiguiente();
        }
        if (factura.getNombreCliente().equals("")) {
            JOptionPane.showMessageDialog(null, "El nombre del padre de familia ingresado no se encuentra registrado");
            return;
        }
        double pago = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a pagar"));
        factura.setPago(pago);

        LocalDate fecha = LocalDate.now();
        factura.setFecha(fecha);

        LocalTime hora = LocalTime.now();
        factura.setHora(hora);

        String descrip = JOptionPane.showInputDialog("Ingrese la descripcion de la rutina de este mes:");
        while(aux2!=null){
            if(descrip.equals(aux2.getElemento().getDescripcion())){
                factura.setDescripRutina(descrip);
                break;
            }
            aux2=aux2.getSiguiente();
        }
        if(factura.getDescripRutina().equals("")){
            JOptionPane.showMessageDialog(null, "No se encontro ninguna rutina con esa descripcion\n"
                    + "No se puede registrar el usuario");
            return;
        }
        
        NodoFacturacion nuevo= new NodoFacturacion();
        nuevo.setElemento(factura);
        
        if(esVaciaSC()){
         inicio=nuevo;
         fin=nuevo;
         fin.setSiguiente(inicio);
      }else if(factura.getPago()<inicio.getElemento().getPago()){
         nuevo.setSiguiente(inicio);
         fin.setSiguiente(inicio);
         inicio=nuevo;
      }else if(factura.getPago()>fin.getElemento().getPago()){
         fin.setSiguiente(nuevo);
         fin=nuevo;
         fin.setSiguiente(inicio);
      }else{
         NodoFacturacion auxFac=inicio;      
         while(auxFac.getSiguiente().getElemento().getPago()<
                 factura.getPago()){
            auxFac=auxFac.getSiguiente();
         }
         nuevo.setSiguiente(auxFac.getSiguiente());
         auxFac.setSiguiente(nuevo);
      }
      JOptionPane.showMessageDialog(null,"Factura agregada"); 
    }

        
    public void mostrarFacturaOpcion() {
        if (!esVaciaSC()) {
            String s = "";
            NodoFacturacion aux = inicio;
            s = "Nombre: " + aux.getElemento().getNombreCliente()
                    + "\n, Rutina a hacer: " + aux.getElemento().getDescripRutina()
                    + "\n, Pago: " + aux.getElemento().getPago()
                    + "\n, Fecha: " + aux.getElemento().getFecha()
                    + "\n, Hora: " + aux.getElemento().getHora()
                    + "\n, Estado: " + aux.getElemento().getEst() + "\n";

            aux = aux.getSiguiente();
            
            while (aux != fin.getSiguiente()) {

                s = "Nombre: " + aux.getElemento().getNombreCliente()
                        + "\n, Rutina a hacer: " + aux.getElemento().getDescripRutina()
                        + "\n, Pago: " + aux.getElemento().getPago()
                        + "\n, Fecha: " + aux.getElemento().getFecha()
                        + "\n, Hora: " + aux.getElemento().getHora()
                        + "\n, Estado: " + aux.getElemento().getEst() + "\n";

                aux = aux.getSiguiente();
            }

            JOptionPane.showMessageDialog(null, "Las facturas registradas son los siguientes: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No hay facturas registradas");

        }
    }

    public void Anular() {
        if (!esVaciaSC()) {
            String usuarioBuscar = JOptionPane.showInputDialog(null, "Digite el nombre del usuario al que pertenece la factura:");
            String s = "";
            NodoFacturacion aux = inicio;
            while (aux != fin.getSiguiente()) {
                if (usuarioBuscar.equals(aux.getElemento().getNombreCliente())) {
                    aux.getElemento().setEst(Estado.ANULADA);
                    s = "Nombre: " + aux.getElemento().getNombreCliente()
                            + "\n, Rutina a hacer: " + aux.getElemento().getDescripRutina()
                            + "\n, Pago: " + aux.getElemento().getPago()
                            + "\n, Fecha: " + aux.getElemento().getFecha()
                            + "\n, Hora: " + aux.getElemento().getHora()
                            + "\n, Estado: " + aux.getElemento().getEst() + "\n";
                    JOptionPane.showMessageDialog(null, "La factura: \n" + s+"\nFue anulada con exito!!");
                    return;
                    
                }
                aux = aux.getSiguiente();

            }
            JOptionPane.showMessageDialog(null,"La factura que se quiere anular no existe\n "
                    + "Intentelo nuevamente");
            
        } else {
            JOptionPane.showMessageDialog(null, "No hay facturas registradas");

        }
    }
}
