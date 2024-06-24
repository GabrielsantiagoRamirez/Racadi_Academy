package Controlador;

import Modelo.BD_profesores;
import Modelo.BaseDatosEstudiante;
import Modelo.Profesor;
import Vista.LoginEstudiante;
import Vista.VistaEstudiante;
import Vista.vista_inicial;
import Vista.vista_profesor;

public class controlador_inicial {
    vista_profesor vista_profesor = new vista_profesor();
    vista_inicial vista_ini= new vista_inicial();
    controlador_profesor control_profe= new controlador_profesor();
    VistaEstudiante vistaEstudiante = new VistaEstudiante();
    LoginEstudiante loginEstudiante = new LoginEstudiante();
    BaseDatosEstudiante baseDatosEstudiante = new BaseDatosEstudiante();
    int opciones=0;
    boolean continuar = true;

    public void conectar(){
        while(continuar) {
            opciones = vista_ini.menu_inicial();
            switch (opciones) {
                case 1:
                    /*String correo = loginEstudiante.PedirCorreo();
                    String contraseña = loginEstudiante.PedirContraseña();
                    Boolean comprobar = baseDatosEstudiante.comprobarLogin(correo,contraseña);
                    if (comprobar==true){
                        vistaEstudiante.conectar();
                    }
                    else {
                        vistaEstudiante.mostrarMensaje("inicio de secion no exitoso");
                        continuar=false;
                    }
                    break;*/
                    vistaEstudiante.conectar();
                case 2:
                    vista_profesor.conectar();
                    break;
                case 3:
                    vista_profesor.salida();
                    continuar=false;
                    break;
            }
        }
    }

}
