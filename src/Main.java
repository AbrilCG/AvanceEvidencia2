/**
 *
 * @author LyrisseC
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Usuario> usuario; 
    public static void main(String[] args) {
        boolean existeUsuario; 
        String us = ""; 
        String contraseña = ""; 
        Scanner Cre = new Scanner(System.in);
        System.out.println("Cargando Sistema....");
        cargarUsuario();
        System.out.println("Iniciar sesion");
        System.out.println("Usuario:");
        us = Cre.nextLine();
        System.out.println("Contraseña:");
        contraseña = Cre.nextLine();
        existeUsuario = validarCredenciales(us,contraseña);
        if(existeUsuario){
            System.out.println("Usuario Existente");
            me();
        }else{
            System.out.println("Usuario Inexistente");
        }
    }
    
public static void cargarUsuario() {    
    if(usuario == null){
        usuario = new ArrayList<>();
    }
    usuario.add(new Usuario(1, "Lyrisse", "4567"));
    usuario.add(new Usuario(2, "Ytzel", "4567"));
    System.out.println("Los usuarios han sido cargados " +usuario.size());
}

public static boolean validarCredenciales(String us, String contraseña){
    return usuario.stream().anyMatch(x->x.getNombre().equals(us)&& x.getContraseña().equals(contraseña));
}

public static void me(){
    Scanner sc = new Scanner(System.in);
    int op;
    System.out.println("Menu");
    System.out.println("Presiona 1 si quieres dar de alta a un Medico");
    System.out.println("Presiona 2 si quieres dar de alta a un Paciente");
    System.out.println("Presiona 3 si quieres ver la citas por nombre del medico");
    System.out.println("Presiona 4 si quieres ver las citas por nombre del paciente");
    System.out.println("Que quieres hacer??");
    op = sc.nextInt();
    switch (op) {
                case 1:
                    System.out.println("Seleccionaste la opcion 1 - Dar de alta a un Medico");
                    Medico m = new Medico();
                    System.out.println("Dame la siguiente informacion");
                    System.out.println("Identificacion");
                    int id=sc.nextInt();
                    System.out.println("Nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Apellido paterno");
                    String apPaterno = sc.nextLine();
                    System.out.println("Apellido Materno");
                    String apMaterno = sc.nextLine();
                    System.out.println("Edad");
                    int edad = sc.nextInt();
                    System.out.println("Sexo");
                    String sexo = sc.nextLine();
                    System.out.println("Telefono");
                    int telefono = sc.nextInt();
                    System.out.println("Calle de su domicilio");
                    String calle = sc.nextLine();
                    System.out.println("Numero de domicilio");
                    int numero = sc.nextInt();
                    System.out.println("Colonia");
                    String colonia = sc.nextLine();
                    System.out.println("Municipio");
                    String municipio = sc.nextLine();
                    System.out.println("Ciudad");
                    String ciudad = sc.nextLine();
                    System.out.println("Codigo postal");
                    int cp = sc.nextInt(); 
                    System.out.println("No. Cedula");
                    int noCedula = sc.nextInt();
                    System.out.println("Especialidad");
                    String especialidad = sc.nextLine();
                    break;

                case 2:
                    System.out.println("Seleccionaste la opcion 2 - Dar de alta a un Paciente");
                    Paciente p = new Paciente();
                    System.out.println("Dame la siguiente informacion");
                    System.out.println("Identificacion");
                    int idpaciente=sc.nextInt();
                    System.out.println("Nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Apellido paterno");
                    String apPaterno = sc.nextLine();
                    System.out.println("Apellido Materno");
                    String apMaterno = sc.nextLine();
                    System.out.println("Edad");
                    int edad = sc.nextInt();
                    System.out.println("Sexo");
                    String sexo = sc.nextLine();
                    System.out.println("Telefono");
                    int telefono = sc.nextInt();
                    System.out.println("Calle de su domicilio");
                    String calle = sc.nextLine();
                    System.out.println("Numero de domicilio");
                    int numero = sc.nextInt();
                    System.out.println("Colonia");
                    String colonia = sc.nextLine();
                    System.out.println("Municipio");
                    String municipio = sc.nextLine();
                    System.out.println("Ciudad");
                    String ciudad = sc.nextLine();
                    System.out.println("Codigo postal");
                    int cp = sc.nextInt(); 
                    System.out.println("No.servicio social");
                    int noServicioSocial = sc.nextInt();
                    break;
                    
                case 3:
                    System.out.println("Seleccionaste la opcion 3 - Crear una cita");
                    Cita c  = new Cita();
                    System.out.println("Identificacion de cita");
                    int idCita = sc.nextInt();
                    System.out.println("Fecha");
                    Date fecha = sc.nextLine();
                    System.out.println("Doctor");
                    String doctor = sc.nextLine();
                    System.out.println("Paciente");
                    String paciente = sc.nextLine();
                break;
    }
}
}