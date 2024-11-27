package proyecto_estructuradatos;

import javax.swing.JOptionPane;

public class ColaPadresDeFamilia {
    private NodoPadresDeFamilia inicio;
    private NodoPadresDeFamilia fin;

    public ColaPadresDeFamilia() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void encolar() {
        PadresDeFamilia d = new PadresDeFamilia();
        d.setNombrePadre(JOptionPane.showInputDialog("Cual es el nombre del padre de familia? "));
        d.setApellidosPadre(JOptionPane.showInputDialog("Cuales son los apellidos del padre de familia? "));
        d.setNombreHijo(JOptionPane.showInputDialog("Cual es el nombre del hijo? "));
        d.setCiudad(JOptionPane.showInputDialog("Cual es la ciudad? "));
        d.setCorreo(JOptionPane.showInputDialog("Cual es el correo? "));
        d.setDireccion(JOptionPane.showInputDialog("Cual es la direccion? "));
        d.setTelefono(JOptionPane.showInputDialog("Cual es el telefono? "));

        Estado[] opciones = Estado.values();
        Estado seleccion = (Estado) JOptionPane.showInputDialog(
                null,
                "Seleccione el estado del padre de familia:",
                "Estado",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0] // Opción predeterminada
        );
        if (seleccion != null) {
            d.setEstado(seleccion); // Asegúrate de que el método setEstado acepte el tipo Estado
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un estado.");
            return; // Salir del método si no se selecciona un estado
        }
        NodoPadresDeFamilia nuevo = new NodoPadresDeFamilia();
        nuevo.setElemento(d);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void desencolar() {
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null,
                    "¡El elemento fue extraído!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "¡No se puede extraer, cola vacía!");
        }
    }

    public void mostrar() {
        if (!esVacia()) {
            String s = "";
            NodoPadresDeFamilia aux = inicio;
            while (aux != null) {
                PadresDeFamilia d = aux.getElemento();
                s = s +
                        "Nombre del Padre: " + d.getNombrePadre() + "\n" +
                        "Apellidos del Padre: " + d.getApellidosPadre() + "\n" +
                        "Nombre del Hijo: " + d.getNombreHijo() + "\n" +
                        "Ciudad: " + d.getCiudad() + "\n" +
                        "Correo: " + d.getCorreo() + "\n" +
                        "Dirección: " + d.getDireccion() + "\n" +
                        "Teléfono: " + d.getTelefono() + "\n" +
                        "Estado: " + d.getEstado() + "\n" +
                        "----------------------------------\n";

                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La cola contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,
                    "¡No se puede mostrar, cola vacía!");
        }
    }
}
