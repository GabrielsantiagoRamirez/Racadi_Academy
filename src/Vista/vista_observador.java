package Vista;

import javax.swing.*;

import Controlador.controlador_observador;
public class vista_observador {

    private int opcion;

    public int menu(){
        String opciones = "elige un aopcion :\n1.añadir al observador:\n2.Mostrar observaciones\n3.salir";
        String input = JOptionPane.showInputDialog( null,opciones);
        opcion = Integer.parseInt(input);
        return opcion;
    }

  public String recicibirNombre(){
      String nombre = JOptionPane.showInputDialog(null,"ingresa el  nombre");
      return nombre;
    }

    public String recicibirFecha(){
        String Fecha = JOptionPane.showInputDialog(null,"ingresa la fecha");
        return Fecha;
    }

    public String recicibirID(){
        String documento = JOptionPane.showInputDialog(null,"ingresa tu numero de documento");
        return documento;
    }
    public String recicibirIDHash(){
        String documento = JOptionPane.showInputDialog(null,"ingrese el id del comunicado");
        return documento;
    }

    public String recicibirComunicado(){
        String comunicado = JOptionPane.showInputDialog(null,"ingresa el comunicado");
        return comunicado;
    }


    public void mensajeMostrar(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }





        public void mostrar(String mensaje) {
            JOptionPane.showMessageDialog(null, mensaje);
        }


    public void conectar(){
        Controlador.controlador_observador con = new controlador_observador();
        con.control();
    }


}
