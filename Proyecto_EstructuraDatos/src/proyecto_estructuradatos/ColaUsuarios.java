package proyecto_estructuradatos;

import javax.swing.JOptionPane;

public class ColaUsuarios {
    private Nodo inicio; 
    private Nodo fin;    

    public ColaUsuarios() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean esVacia(){
        if(inicio==null){
            return true;
        
        } else{
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
        } else{
            JOptionPane.showMessageDialog(null,"No hay usuario registrados");
        
        }
    }
}

