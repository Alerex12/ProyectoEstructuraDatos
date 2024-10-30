
package proyecto_estructuradatos;

import javax.swing.JOptionPane;

public class Menu {
    
        private byte opt;
    private ColaUsuarios usuario =new ColaUsuarios();

    
    public void mostrarMenu(){
        opt=Byte.parseByte(JOptionPane.showInputDialog("--------BIENVENIDO AL MENU DEL GIMNASIO INFANTIL ESTRELLITAS--------\n"+
                "Que accion desea realizar?\n"
                + "1-Agregar usuario\n"
                + "2-Consular los usuarios registrados\n"
                + "3-Inactivar usuario\n"
                + "4-Salir del sistema"));
        switch(opt){
            case 1:
                usuario.encolarUsuario();
                mostrarMenu();
                break;
            case 2:
                usuario.mostrarUsuarios();
                mostrarMenu();
                break;
            case 3:
                usuario.Inactivar();
               mostrarMenu();
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Saliendo del sistema");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion ingresada invalida");
                mostrarMenu();
  
        }

    }
    
}
