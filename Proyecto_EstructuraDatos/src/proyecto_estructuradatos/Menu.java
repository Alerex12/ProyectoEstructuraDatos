package proyecto_estructuradatos;

import javax.swing.JOptionPane;

public class Menu {

    private byte opt;
    private int opt2;
    private ColaUsuarios usuario = new ColaUsuarios();
    private Funcion_Subcatalogos f= new Funcion_Subcatalogos();

    public void mostrarMenu() {
        opt = Byte.parseByte(
                JOptionPane.showInputDialog("--------BIENVENIDO AL MENU DEL GIMNASIO INFANTIL ESTRELLITAS--------\n" +
                        "¿A cual catalogo desea acceder?\n"
                        + "1-Catalogo usuario\n"
                        + "2-Catalogo deportista\n"
                        + "3-Catalogos padres de familia\n"
                        + "4-Catalogos deporte\n"
                        + "5-Catalogo de rutinas\n"
                        + "6-Salir del sistema"));
        switch (opt) {
            case 1:
                do {
                    opt2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que accion desea realizar con los usuarios?\n"
                            + "1-Agregar un usuario\n"
                            + "2-Inactivar usuario\n"
                            + "3-Mostrar todos los usuarios\n"
                            + "4-Salir del catalogo de usuarios\n"));
                    switch (opt2) {
                        case 1:
                            usuario.encolarUsuario();
                            break;
                        case 2:
                            usuario.inactivar();
                            break;
                        case 3:
                            usuario.mostrarUsuarios();
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Saliendo del catalogo de usuarios");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;

                    }
                } while(opt2!=4);
                mostrarMenu();
                break;
                
            case 2:
                do {
                    opt2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que accion desea realizar con los deportistas?\n"
                            + "1-Agregar un deportista\n"
                            + "2-Editar un deportista\n"
                            + "3-Inactivar un deportista\n"
                            + "4-Mostrar deportistas\n"
                            + "5-Salir del catalogo deportistas"));
                    switch (opt2) {
                        case 1:
                            f.encolarDeportista();
                            break;
                        case 2:
                            f.editarDeportista();
                            break;
                        case 3:
                            f.inactivarDeportista();
                            break;
                        case 4:
                            f.mostrarDeportistas();
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Saliendo del catalogo de deportistas");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;

                    }
                } while (opt2 != 5);
                
                mostrarMenu();
                break;
            case 3:
                do {
                    opt2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que accion desea realizar con los padres de familia?\n"
                            + "1-Agregar un padre de familia\n"
                            + "2-Editar un padre de familia\n"
                            + "3-Inactivar un padre de familia\n"
                            + "4-Mostrar padres de familia\n"
                            + "5-Salir del catalogo padres de familia"));
                    switch (opt2) {
                        case 1:
                            f.encolarPadres();
                            break;
                        case 2:
                            f.editarPadres();
                            break;
                        case 3:
                            f.inactivarPadres();
                            break;
                        case 4:
                            f.mostrarPadre();
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Saliendo del catalogo de padres de familia");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;

                    }
                } while (opt2 != 5);

                mostrarMenu();
                break;
            case 4:
                do {
                    opt2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que accion desea realizar con los deportes?\n"
                            + "1-Agregar un deporte\n"
                            + "2-Editar un deporte\n"
                            + "3-Inactivar un deporte\n"
                            + "4-Mostrar deportes\n"
                            + "5-Salir del catalogo deportes"));
                    switch (opt2) {
                        case 1:
                            f.encolarDeporte();
                            break;
                        case 2:
                            f.editarDeporte();
                            break;
                        case 3:
                            f.inactivarDeporte();
                            break;
                        case 4:
                            f.mostrarDeportes();
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Saliendo del catalogo deportes");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;

                    }
                } while (opt2 != 5);
                
                mostrarMenu();
                break;
            case 5:
                do {
                    opt2 = Integer.parseInt(JOptionPane.showInputDialog("¿Que accion desea realizar con las rutinas?\n"
                            + "1-Agregar un rutina\n"
                            + "2-Editar una rutina\n"
                            + "3-Inactivar una rutina\n"
                            + "4-Mostrar rutinas\n"
                            + "5-Salir del catalogo rutinas"));
                    switch (opt2) {
                        case 1:
                            f.encolarRutina();
                            break;
                        case 2:
                            f.editarRutina();
                            break;
                        case 3:
                            f.inactivarRutina();
                            break;
                        case 4:
                            f.mostrarRutinas();
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "Saliendo del catalogo rutinas");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion invalida");
                            break;
                    }
                } while (opt2 != 5);
                
                mostrarMenu();
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion ingresada invalida");
                mostrarMenu();
        }
    }
}
