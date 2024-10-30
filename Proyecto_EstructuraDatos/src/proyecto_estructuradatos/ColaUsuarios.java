/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estructuradatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabo
 */
public class ColaUsuarios {
    private Nodo inicio; 
    private Nodo fin;    
    // Constructor
    public ColaUsuarios() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean esVacia(){
        if(inicio==null){
            return true;
        
        }else{
            return false;
        }
    
    }

    
    public void encolarUsuario() {
        Usuario nuevo = new Usuario();
        nuevo.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del usuario: "));
        nuevo.setApellidos(JOptionPane.showInputDialog("Ingrese los apellidos del usuario: "));
        nuevo.setNombreUsuario(JOptionPane.showInputDialog("Ingrese el nombre de usurio del usuario: "));
        nuevo.setClave(JOptionPane.showInputDialog("Ingrese la clave del usuario: "));
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setUsuario(nuevo);
        
        if (inicio == null) {  
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo); 
            fin = nuevoNodo; 
        }
        System.out.println("Usuario encolado: " + nuevo.getNombre() + " " + nuevo.getApellidos());
    }
    
        public void mostrarUsuarios(){
        if(!esVacia()){
            String s="";
            Nodo aux=inicio;
            int cont=1;
            while(aux!=null){
                s=s+cont+") " + "Nombre: "+aux.getUsuario().getNombre()
                        +", Apellidos: "+aux.getUsuario().getApellidos()
                        +", Nombre de usuario: "+aux.getUsuario().getNombreUsuario()
                        +", Clave: "+aux.getUsuario().getClave()
                        +", Estado: "+aux.getUsuario().getEstado()+"\n";
                cont++;
                aux=aux.getSiguiente();
            
            }
            JOptionPane.showMessageDialog(null, "Los usuarios registrados son los siguientes: \n"+s);
        }else{
            JOptionPane.showMessageDialog(null,"No hay usuario registrados");
        
        }
    
    }
        public void Inactivar() {
            
                    if(!esVacia()){
                       String usuarioBuscar= JOptionPane.showInputDialog(null, "digite el usuario a buscar");
            String s="";
            Nodo aux=inicio;
            int cont=1;
            while(aux!=null){
                if (usuarioBuscar.equals(aux.getUsuario().getNombreUsuario()) ) {
                    aux.getUsuario().setEstado(Estado.INACTIVO);  
                    s="Nombre: "+aux.getUsuario().getNombre()
                        +", Apellidos: "+aux.getUsuario().getApellidos()
                        +", Nombre de usuario: "+aux.getUsuario().getNombreUsuario()
                        +", Clave: "+aux.getUsuario().getClave()
                        +", Estado: "+aux.getUsuario().getEstado()+"\n";
                }
                aux=aux.getSiguiente();
            
            }
            
            JOptionPane.showMessageDialog(null, "Los usuarios registrados son los siguientes: \n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuario registrados");

        }

    }
}
