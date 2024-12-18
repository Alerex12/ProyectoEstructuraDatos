
package proyecto_estructuradatos;
//Aqui vamos a trabajar la funcionalidad de todos los subcatalogos del modulo dos 

import javax.swing.JOptionPane;

//Todos los subcatalogos son colas
public class Funcion_Subcatalogos {
    
    private NodoDeportista inicioDeportista;
    private NodoDeportista finDeportista;
    private NodoDeportes inicioDeportes;
    private NodoDeportes finDeportes;
    private NodoPadresDeFamilia inicioPadres;
    private NodoPadresDeFamilia finPadres;
    private NodoRutina inicioRutinas;
    private NodoRutina finRutinas;

    public Funcion_Subcatalogos() {
        this.inicioDeportista = null;
        this.finDeportista = null;
        this.inicioDeportes = null;
        this.finDeportes = null;
        this.inicioPadres = null;
        this.finPadres = null;
        this.inicioRutinas = null;
        this.finRutinas = null;
    }

    public NodoPadresDeFamilia getInicioPadres() {
        return inicioPadres;
    }

    public NodoRutina getInicioRutinas() {
        return inicioRutinas;
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
                                + "3-Editar Identificacion\n"
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
        
         if (!esVaciaPadres()) {
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
                                + "3-Editar nombre del hijo\n"
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
        if (!esVaciaPadres()) {
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
    
    public void encolarDeporte() {
        Deportes nuevo = new Deportes();
        nuevo.setNombre(JOptionPane.showInputDialog("Ingrese el deporte del niño: "));
        nuevo.setCaracterísticas(JOptionPane.showInputDialog("Ingrese las caracteristicas que tiene el deporte: "));
        NodoDeportes nuevoNodo = new NodoDeportes();
        nuevoNodo.setElemento(nuevo);

        if (inicioDeportes == null) {
            inicioDeportes = nuevoNodo;
            finDeportes = nuevoNodo;
        } else {
            finDeportes.setSiguiente(nuevoNodo);
            finDeportes = nuevoNodo;
        }
        JOptionPane.showMessageDialog(null, "Deporte registrado correctamente!!1");
    }
    
    public void editarDeporte(){
        if (!esVaciaDeportes()) {
            String eleccion = JOptionPane.showInputDialog("Ingrese el nombre del deporte que quiere editar: ");
            NodoDeportes aux = inicioDeportes;
            while (aux != null) {
                if (aux.getElemento().getNombre().equals(eleccion)) {
                    int opt;

                    do {
                        opt = Integer.parseInt(JOptionPane.showInputDialog("¿Que informacion desea editar del deporte?\n"
                                + "1-Editar nombre del deporte\n"
                                + "2-Editar caracteristicas del deporte\n"
                                + "3-Salir\n"));

                        switch (opt) {
                            case 1:
                                aux.getElemento().setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre del deporte: "));
                                JOptionPane.showMessageDialog(null, "Nombre editado correctamente!!");
                                break;
                            case 2:
                                aux.getElemento().setCaracterísticas(JOptionPane.showInputDialog("Ingrese las nuevas caracteristicas del deporte: "));
                                JOptionPane.showMessageDialog(null, "Caracteristicas editas correctamente!!");
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Saliendo de edicion de deportes...");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion");
                                break;
                        }
                    } while (opt != 3);

                    return;
                }
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Deporte no encontrado");
        }else{JOptionPane.showMessageDialog(null, "Ningun deporte registrado nada que editar");}
    
    }
    
    public void inactivarDeporte(){
        if (!esVaciaDeportes()) {
            String eleccion = JOptionPane.showInputDialog("Ingrese el nombre del deporte que quiere inactivar: ");
            NodoRutina aux2= inicioRutinas;
            NodoDeportes aux = inicioDeportes;
            while(aux2!= null){
                if(eleccion.equals(aux2.getElemento().getDeportePerteneciente().getNombre())){
                    if(aux2.getElemento().getEstado()==Estado.ACTIVO){
                        JOptionPane.showMessageDialog(null,"Hay una rutina en activo asignada a este deporte\n"
                                + "No se puede inactivar deporte hasta que no tenga todas las rutinas inactivadas");
                        return; 
                    }
                }
                aux2=aux2.getSiguiente();
            }

            while (aux != null) {
                if (aux.getElemento().getNombre().equals(eleccion)) {
                    aux.getElemento().setEstado(Estado.INACTIVO);
                    JOptionPane.showMessageDialog(null, "Deporte inactivado");
                    return;
                }
                aux= aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "No se encontro el deporte...");
        }else{JOptionPane.showMessageDialog(null, "Ningun deporte registrado nada que inactivar");}
    }
    
     public void mostrarDeportes(){
        if (!esVaciaDeportes()) {
            String s = "";
            int cont=1;
            NodoDeportes aux = inicioDeportes;
            while (aux != null) {
                s = s +"["+cont+"]"+"Nombre: "+ aux.getElemento().getNombre()+"---"+
                        "Caracteristicas: "+aux.getElemento().getCaracterísticas()+"---"+
                        "Estado: "+aux.getElemento().getEstado()+"\n";
                aux= aux.getSiguiente();
                cont+=1;
            }
            JOptionPane.showMessageDialog(null, "Los deportes registrados son:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No hay deportes registrados, nada que mostrar");
        }
    }
    
     
  //++++++++++++++++++++++++++++ METODOS RUTINAS+++++++++++++++++++++++++++++++++++
         public boolean esVaciaRutina() {
        if (inicioRutinas == null) {
            return true;
        } else {
            return false;
        }
    }


    public void encolarRutina() {
        NodoDeportes aux= inicioDeportes;
        NodoRutina aux2=inicioRutinas;
        
        String nomDeporte= JOptionPane.showInputDialog("Ingrese el nombre del deporte al que pertenece la rutina: ");
        while(aux!=null){
            if(aux.getElemento().getNombre().equals(nomDeporte)){
                
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la rutina: "));
                while (aux2 != null) {
                    if (id == aux2.getElemento().getIdRutina()) {
                        JOptionPane.showMessageDialog(null, "La rutina que desea registrar ya existe.");
                        return;
                    }
                    aux2= aux2.getSiguiente();
                }
                Rutina rutina = new Rutina();
                rutina.setDeportePerteneciente(aux.getElemento());
                rutina.setIdRutina(id);
                rutina.setDescripcion(JOptionPane.showInputDialog("Ingrese la descripcion de la ruina: "));
                rutina.setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la rutina en minutos: ")));

                NodoRutina nuevo = new NodoRutina();
                nuevo.setElemento(rutina);

                if (inicioRutinas == null) {
                    inicioRutinas = nuevo;
                    finRutinas = nuevo;
                } else {
                    finRutinas.setSiguiente(nuevo);
                    finRutinas = nuevo;
                }
                JOptionPane.showMessageDialog(null, "Rutina guardada con exito!!!");
                return;
            }
            aux= aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "No se encontro el deporte al que se quiere asignar"
                + " la rutina\n"+ "Intentelo nuevamente");
    }

    public void mostrarRutinas() {
    if (!esVaciaRutina()) {
        String s = "";
        NodoRutina aux = inicioRutinas;
        while (aux != null) {
            s = s
                + "ID de la rutina: "+aux.getElemento().getIdRutina()+"\n"
                + "Deporte al que pertenece la rutina: "+ aux.getElemento().
                        getDeportePerteneciente().getNombre()+"\n"
                + "Descripcion de la rutina: "+ aux.getElemento().getDescripcion()+"\n"
                + "Duracion: "+ aux.getElemento().getDuracion()+"\n"
                + "Estado: "+aux.getElemento().getEstado()+"\n"+
                  "---------------------------------------------------\n";
            aux = aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "Las rutinas registradas son:\n" + s);
    } else {
        JOptionPane.showMessageDialog(null, "No hay rutinas registradas, nada que mostrar");
    }
}

    public void editarRutina() {
        if (!esVaciaRutina()) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la rutina a editar:"));
            NodoRutina aux = inicioRutinas;
            while (aux != null) {
                if (aux.getElemento().getIdRutina() == id) {
                    int opcion;

                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog(
                                "¿Qué desea editar?\n"
                                + "1. ID\n"
                                + "2. Descripción\n"
                                + "3. Deporte al que pertenece la rutina"
                                + "4. Duración\n"
                                + "5. Salir"
                        ));

                        switch (opcion) {
                            case 1:
                                NodoRutina aux2 = inicioRutinas;
                                id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo ID de la rutina: "));
                                while (aux2 != null) {
                                    if (id == aux2.getElemento().getIdRutina()) {
                                        JOptionPane.showMessageDialog(null, "La rutina que desea registrar ya existe.");
                                        return;
                                    }
                                    aux2 = aux2.getSiguiente();
                                }
                                aux.getElemento().setIdRutina(id);
                                JOptionPane.showMessageDialog(null, "ID actualizado.");
                                break;
                            case 2:
                                aux.getElemento().setDescripcion(JOptionPane.showInputDialog("Ingrese la nueva descripción: "));
                                JOptionPane.showMessageDialog(null, "Descripción actualizada.");
                                break;
                            case 3:
                                NodoDeportes auxD = inicioDeportes;
                                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del deporte al que quiere reasignar la rutina: ");
                                while (auxD != null) {
                                    if (auxD.getElemento().getNombre().equals(nombre)) {
                                        aux.getElemento().setDeportePerteneciente(auxD.getElemento());
                                        JOptionPane.showMessageDialog(null, "Rutina reasignada con exito!!!");
                                        return;
                                    }
                                    auxD = auxD.getSiguiente();
                                }
                                JOptionPane.showMessageDialog(null, "No se encontro el deporte al que desea reasignar la rutina");
                                break;

                            case 4:
                                aux.getElemento().setDuracion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva duración (en minutos): ")));
                                JOptionPane.showMessageDialog(null, "Duración actualizada.");
                                break;
                            case 5:
                                JOptionPane.showMessageDialog(null, "Saliendo de la edición.");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opción no válida.");
                        }
                    } while (opcion != 5);
                    return;
                }
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Rutina no encontrada.");
        } else {
            JOptionPane.showMessageDialog(null, "No hay rutinas registradas.");
        }
    }
    
    public void inactivarRutina() {
        if (!esVaciaRutina()) {
            int eleccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la rutina que quiere inactivar: "));
            NodoRutina aux = inicioRutinas;

            while (aux != null) {
                if (aux.getElemento().getIdRutina()==eleccion) {
                    aux.getElemento().setEstado(Estado.INACTIVO);
                    JOptionPane.showMessageDialog(null, "Rutina inactivada");
                    return;
                }
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "No se encontro el rutina...");
        } else {
            JOptionPane.showMessageDialog(null, "Ninguna rutina registrada nada que inactivar");
        }
    }
    
    public Rutina devolver(int a){
        Rutina r;
        NodoRutina aux = inicioRutinas;

        while (aux != null) {
            if (a == aux.getElemento().getIdRutina()) {
                r = aux.getElemento();
                return r;
            }
            
            aux= aux.getSiguiente();
        }
        return null;
    }
    
}

    
    
    


