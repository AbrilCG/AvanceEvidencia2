import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author LyrisseC
 */
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
    int op = 0;
    System.out.println("Menu");
    System.out.println("Presiona 1 si quieres dar de alta a un Medico");
    System.out.println("Presiona 2 si quieres dar de alta a un Paciente");
    System.out.println("Presiona 3 si quieres creae una cita");
    System.out.println("Que quieres hacer??");
    op = sc.nextInt();
    switch (op){
        case 1: 
                    System.out.println("Seleccionaste la opcion 1 - Dar de alta a un Medico");
                    Medico m = new Medico();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Proporciona los siguientes datos");
                    System.out.println("Id del Medico");
                    m.idMedico = sc.nextInt();
                    System.out.println("Nombre del Medico");
                    m.nombre = sc.nextLine();
                    System.out.println("Apellido Paterno del Medico");
                    m.apPaterno = sc.nextLine();
                    System.out.println("Apellido Materno del Medico");
                    m.apMaterno = sc.nextLine();
                    System.out.println("Edad Medico");
                    m.edad = sc.nextInt();
                    System.out.println("Sexo del Medico");
                    m.sexo =sc.nextLine();
                    System.out.println("Telefono del Medico");
                    m.telefono = sc.nextInt();
                    System.out.println("Numero del cedula");
                    m.noCedula = sc.nextInt();
                    System.out.println("Especialidad");
                    m.especialidad = sc.nextLine();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Proporciona los siguientes datos del domicilio del Medico");
                    System.out.println("Calle");
                    m.calle = sc.nextLine();
                    System.out.println("Numero de la casa");
                    m.numero = sc.nextInt();
                    System.out.println("Colonia");
                    m.colonia = sc.nextLine();
                    System.out.println("Municipio");
                    m.municipio = sc.nextLine();
                    System.out.println("Ciudad");
                    m.ciudad = sc.nextLine();
                    System.out.println("Codigo postal");
                    m.cp = sc.nextInt();
        break;
        case 2:
                    System.out.println("Seleccionaste la opcion 2 - Dar de alta a un Paciente");
                    Paciente p = new Paciente();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Proporciona los siguientes datos");
                    System.out.println("Id");
                    p.idPaciente = sc.nextInt();
                    System.out.println("Nombre del paciente");
                    p.nombre = sc.nextLine();
                    System.out.println("Apellido Paterno");
                    p.apPaterno = sc.nextLine();
                    System.out.println("Apellido Materno");
                    p.apMaterno = sc.nextLine();
                    System.out.println("Edad");
                    p.edad = sc.nextInt();
                    System.out.println("Sexo");
                    p.sexo =sc.nextLine();
                    System.out.println("Telefono");
                    p.telefono = sc.nextInt();
                    System.out.println("Seguro Social");
                    p.seguroSocial = sc.nextInt();
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("Proporciona los siguientes datos del domicilio del Medico");
                    System.out.println("Calle");
                    p.calle = sc.nextLine();
                    System.out.println("Numero de la casa");
                    p.numero = sc.nextInt();
                    System.out.println("Colonia");
                    p.colonia = sc.nextLine();
                    System.out.println("Municipio");
                    p.municipio = sc.nextLine();
                    System.out.println("Ciudad");
                    p.ciudad = sc.nextLine();
                    System.out.println("Codigo postal");
                    p.cp = sc.nextInt();
        break;      
        case 3:             
                    System.out.println("Seleccionaste la opcion 3 - Crear una cita");
                    Cita c  = new Cita();
                    System.out.println("Id Cita");
                    c.idCita = sc.nextInt();
                    System.out.println("Fecha");
                    c.fecha= sc.nextInt();
                    System.out.println("Medico que atendera la cita");
                    c.Medico = sc.nextLine();
                    System.out.println("Paciente");
                    c.Paciente = sc.nextLine();
        break;
}
}
}

