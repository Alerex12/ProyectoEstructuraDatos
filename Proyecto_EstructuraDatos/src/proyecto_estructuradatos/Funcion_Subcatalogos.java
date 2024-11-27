
package proyecto_estructuradatos;
//Aqui vamos a trabajar la funcionalidad de todos los subcatalogos del modulo dos 

import javax.swing.JOptionPane;


public class Funcion_Subcatalogos {
    
    private NodoDeportista inicioDeportista;
    private NodoDeportista finDeportista;
    private NodoDeportes inicioDeportes;
    private NodoDeportes finDeportes;
    private NodoPadresDeFamilia inicioPadres;
    private NodoPadresDeFamilia finPadres;

    public Funcion_Subcatalogos() {
        this.inicioDeportista = null;
        this.finDeportista = null;
        this.inicioDeportes = null;
        this.finDeportes = null;
        this.inicioPadres = null;
        this.finPadres = null;
    }
   
    public boolean esVaciaDepor(){
         if(inicioDeportista==null){
         return true;
      }else{
         return false;
      }
    }
    
    public boolean esVaciaDeportes(){
         if(inicioDeportes==null){
         return true;
      }else{
         return false;
      }
    }
    
    public boolean esVaciaPadres(){
         if(inicioPadres==null){
         return true;
      }else{
         return false;
      }
    }
    
    public void encolarDeportista(){
        Deportista depor = new Deportista();
        depor.setIdentificacion(JOptionPane.showInputDialog("Ingrese la identificación del deportista: "));
        depor.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del deportista: "));
        depor.setApellido(JOptionPane.showInputDialog("Ingrese el apellido del deportista: "));
        depor.setCorreo(JOptionPane.showInputDialog("Ingrese el correo electronico del deportista: "));
        depor.setTelefono(JOptionPane.showInputDialog("Ingrese numero de telefono del deportista: "));
        depor.setCiudad(JOptionPane.showInputDialog("Ingrese la ciudad donde vive el deportista: "));
        depor.setDireccion(JOptionPane.showInputDialog("Ingrese la direccion del deportista: "));
       
        NodoDeportista nuevo= new NodoDeportista();
        nuevo.setElemento(depor);
        
        if(esVaciaDepor()){
            inicioDeportista= nuevo;
            finDeportista= nuevo;
        }else{
            finDeportista.setSiguiente(nuevo);
            finDeportista = nuevo;
        }
    }
    
    public void editarDeportista() {
        if (!esVaciaDepor()) {
            String eleccion = JOptionPane.showInputDialog("Ingrese la identificacion del deportista que quiere editar: ");
            NodoDeportista aux = inicioDeportista;
            while (aux != null) {
                if (aux.getElemento().getIdentificacion().equals(eleccion)) {
                    int opt;

                    do {
                        opt = Integer.parseInt(JOptionPane.showInputDialog("¿Que informacion desea editar del deportista?\n"
                                + "1-Editar nombre\n"
                                + "2-Editar Apellido\n"
                                + "3-Editar Identificacion"
                                + "4-Editar correo electronico\n"
                                + "5-Editar numero de telefono\n"
                                + "6-Editar ciudad\n"
                                + "7-Editar direccion\n"
                                + "8-Salir\n"));

                        switch (opt) {
                            case 1:
                                aux.getElemento().setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre del deportista: "));
                                JOptionPane.showMessageDialog(null, "Nombre editado correctamente!!");
                                break;
                            case 2:
                                aux.getElemento().setApellido(JOptionPane.showInputDialog("Ingrese el nuevo apellido del deportista: "));
                                JOptionPane.showMessageDialog(null, "Apellido editado correctamente!!");
                                break;
                            case 3:
                                aux.getElemento().setIdentificacion(JOptionPane.showInputDialog("Ingrese la nueva identificacion del deportista: "));
                                JOptionPane.showMessageDialog(null, "Identificacion editada correctamente!!");
                                break;
                            case 4:
                                aux.getElemento().setCorreo(JOptionPane.showInputDialog("Ingrese el nuevo correo eletronico del deportista: "));
                                JOptionPane.showMessageDialog(null, "Correo editado correctamente!!");
                                break;
                            case 5:
                                aux.getElemento().setTelefono(JOptionPane.showInputDialog("Ingrese el nuevo telefono del deportista: "));
                                JOptionPane.showMessageDialog(null, "telefono editada correctamente!!");
                                break;
                            case 6:
                                aux.getElemento().setCiudad(JOptionPane.showInputDialog("Ingrese la nueva ciudad del deportista: "));
                                JOptionPane.showMessageDialog(null, "Ciudad editada correctamente!!");
                                break;
                            case 7:
                                aux.getElemento().setDireccion(JOptionPane.showInputDialog("Ingrese la nueva direccion del deportista: "));
                                JOptionPane.showMessageDialog(null, "Direccion editada correctamente!!");
                                break;
                            case 8:
                                JOptionPane.showMessageDialog(null, "Saliendo de edicion de deportista...");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion");
                                break;
                        }
                    } while (opt != 8);

                    return;
                }
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Deportista no encontrado");
        }else{JOptionPane.showMessageDialog(null, "Ningun deportista registrado nada que editar");}
    }
    
    public void inactivarDeportista(){
        if (!esVaciaDepor()) {
            String eleccion = JOptionPane.showInputDialog("Ingrese la identificacion del deportista que quiere desactivar: ");
            NodoDeportista aux = inicioDeportista;

            while (aux != null) {
                if (aux.getElemento().getIdentificacion().equals(eleccion)) {
                    aux.getElemento().setEstado(Estado.INACTIVO);
                    JOptionPane.showMessageDialog(null, "Deportista desactivado");
                    return;
                }
                aux= aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "No se encontro el deportista...");
        }else{JOptionPane.showMessageDialog(null, "Ningun deportista registrado nada que inactivar");}
    }
    
    public void mostrarDeportistas(){
        if (!esVaciaDepor()) {
            String s = "";
            int cont=1;
            NodoDeportista aux = inicioDeportista;
            while (aux != null) {
                s = s +"["+cont+"]"+"Nombre: "+ aux.getElemento().getNombre()+"---"+
                        "Apellido: "+aux.getElemento().getApellido()+"---"+
                        "Identificacion: "+aux.getElemento().getIdentificacion()+"---"+
                        "Estado: "+aux.getElemento().getEstado()+"---"+
                        "Correo electronico: "+aux.getElemento().getCorreo()+"---"+
                        "Telefono: "+aux.getElemento().getTelefono()+"---"+
                        "Ciudad: "+aux.getElemento().getCiudad()+"---"+
                        "Direccion: "+aux.getElemento().getDireccion()+"\n";
                aux= aux.getSiguiente();
                cont+=1;
            }
            JOptionPane.showMessageDialog(null, "Los deportistas registrados:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay deportistas registrados");
        }
    }
    
    public void encolarPadres(){
        PadresDeFamilia d = new PadresDeFamilia();
        NodoDeportista aux= inicioDeportista;
        String nomHijo= JOptionPane.showInputDialog("Ingrese el nombre del hijo: ");
        while (aux != null) {
            if (aux.getElemento().getNombre().equals(nomHijo)) {
                d.setNombreHijo(nomHijo);
                break;
            } 
            aux=aux.getSiguiente();
        }
        if(d.getNombreHijo().equals("")){
            JOptionPane.showMessageDialog(null, "No se encontro el nombre del hijo intente nuevamente");
            return;
        }
        d.setNombrePadre(JOptionPane.showInputDialog("Cual es el nombre del padre de familia? "));
        d.setApellidosPadre(JOptionPane.showInputDialog("Cuales son los apellidos del padre de familia? "));
        d.setCiudad(JOptionPane.showInputDialog("Cual es la ciudad? "));
        d.setCorreo(JOptionPane.showInputDialog("Cual es el correo? "));
        d.setDireccion(JOptionPane.showInputDialog("Cual es la direccion? "));
        d.setTelefono(JOptionPane.showInputDialog("Cual es el telefono? "));
        
        NodoPadresDeFamilia nuevo = new NodoPadresDeFamilia();
        nuevo.setElemento(d);
        if (esVaciaPadres()) {
            inicioPadres = nuevo;
            finPadres = nuevo;
        } else {
            finPadres.setSiguiente(nuevo);
            finPadres = nuevo;
        }
    }
    
    public void editarPadres(){
        
         if (!esVaciaDepor()) {
            String eleccion = JOptionPane.showInputDialog("Ingrese el nombre del padre que quiere editar: ");
            NodoPadresDeFamilia aux = inicioPadres;
            NodoDeportista aux2= inicioDeportista;
            while (aux != null) {
                if (aux.getElemento().getNombrePadre().equals(eleccion)) {
                    int opt;

                    do {
                        opt = Integer.parseInt(JOptionPane.showInputDialog("¿Que informacion desea editar del padre?\n"
                                + "1-Editar nombre\n"
                                + "2-Editar Apellido\n"
                                + "3-Editar Identificacion"
                                + "4-Editar correo electronico\n"
                                + "5-Editar numero de telefono\n"
                                + "6-Editar ciudad\n"
                                + "7-Editar direccion\n"
                                + "8-Salir\n"));

                        switch (opt) {
                            case 1:
                                aux.getElemento().setNombrePadre(JOptionPane.showInputDialog("Ingrese el nuevo nombre del padre: "));
                                JOptionPane.showMessageDialog(null, "Nombre editado correctamente!!");
                                break;
                            case 2:
                                aux.getElemento().setApellidosPadre(JOptionPane.showInputDialog("Ingrese el nuevo apellido del padre: "));
                                JOptionPane.showMessageDialog(null, "Apellido editado correctamente!!");
                                break;
                            case 3:
                                String nom = JOptionPane.showInputDialog("Ingrese el nombre del hijo: ");
                                while (aux2 != null) {
                                    if (aux2.getElemento().getNombre().equals(nom)) {
                                        aux.getElemento().setNombreHijo(nom);
                                        JOptionPane.showMessageDialog(null, "Nombre del hijo editado correctamente!!");
                                        return;
                                    }  
                                    aux2=aux2.getSiguiente();
                                }
                                JOptionPane.showMessageDialog(null, "No se encontro el nombre del hijo por lo que no se pudo realizar el cambio\n"
                                        + "Intentelo nuevamente");
                                break;
                            case 4:
                                aux.getElemento().setCorreo(JOptionPane.showInputDialog("Ingrese el nuevo correo eletronico del deportista: "));
                                JOptionPane.showMessageDialog(null, "Correo editado correctamente!!");
                                break;
                            case 5:
                                aux.getElemento().setTelefono(JOptionPane.showInputDialog("Ingrese el nuevo telefono del deportista: "));
                                JOptionPane.showMessageDialog(null, "telefono editada correctamente!!");
                                break;
                            case 6:
                                aux.getElemento().setCiudad(JOptionPane.showInputDialog("Ingrese la nueva ciudad del padre: "));
                                JOptionPane.showMessageDialog(null, "Ciudad editada correctamente!!");
                                break;
                            case 7:
                                aux.getElemento().setDireccion(JOptionPane.showInputDialog("Ingrese la nueva direccion del padre: "));
                                JOptionPane.showMessageDialog(null, "Direccion editada correctamente!!");
                                break;
                            case 8:
                                JOptionPane.showMessageDialog(null, "Saliendo de edicion de padres de familia...");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcionin incorrecta");
                                break;
                        }
                    } while (opt != 8);

                    return;
                }
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Padre de familia no encontrado");
        }else{JOptionPane.showMessageDialog(null, "Ningun Padre de familia registrado nada que editar");}
    
    }
    
    public void inactivarPadres(){
        if (!esVaciaDepor()) {
            String eleccion = JOptionPane.showInputDialog("Ingrese el del padre que quiere inactivar: ");
            NodoPadresDeFamilia aux = inicioPadres;

            while (aux != null) {
                if (aux.getElemento().getNombrePadre().equals(eleccion)) {
                    aux.getElemento().setEstado(Estado.INACTIVO);
                    JOptionPane.showMessageDialog(null, "Padre desactivado");
                    return;
                }
                aux= aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "No se encontro el padre ...");
        }else{JOptionPane.showMessageDialog(null, "Ningun padre registrado nada que inactivar");}
    
    }
    
    public void mostrarPadre(){
        if (!esVaciaPadres()) {
            String s = "";
            NodoPadresDeFamilia aux = inicioPadres;
            while (aux != null) {
                PadresDeFamilia d = aux.getElemento();
                s = s
                        + "Nombre del Padre: " + d.getNombrePadre() + "\n"
                        + "Apellidos del Padre: " + d.getApellidosPadre() + "\n"
                        + "Nombre del Hijo: " + d.getNombreHijo() + "\n"
                        + "Ciudad: " + d.getCiudad() + "\n"
                        + "Correo: " + d.getCorreo() + "\n"
                        + "Dirección: " + d.getDireccion() + "\n"
                        + "Teléfono: " + d.getTelefono() + "\n"
                        + "Estado: " + d.getEstado() + "\n"
                        + "----------------------------------\n";

                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Los paddres registrados son:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay padres registrados, nada que mostrar");
        }

    }
    
    
    
    
    

}
