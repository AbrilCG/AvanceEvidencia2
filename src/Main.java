/**
 *
 * @author LyrisseC
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

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

                    System.out.println("Seleccionaste la opcion 1 - Dar de alta a un Medico");
                    Medico m = new Medico();
                    m.setIdMedico(1);
                    m.setNombre("Ytzel");
                    m.setApPaterno("Cavazos");
                    m.setApMaterno("Gonzalez");
                    m.setEdad(18);
                    m.setSexo("Femenino");
                    m.setTelefono(811134556);
                    m.setCalle("Pinguino");
                    m.setNumero(234);
                    m.setColonia("Cuauhtemoc");
                    m.setMunicipio("San Nicolas");
                    m.setCiudad("Nuevo Leon");
                    m.setCp(11234);
                    m.setNoCedula(34567);
                    m.setEspecialidad("Cardiologa");
                
                    System.out.println("Seleccionaste la opcion 2 - Dar de alta a un Paciente");
                    Paciente p = new Paciente();
                    p.setIdPaciente(32);
                    p.setNombre("Sofia");
                    p.setApPaterno("Casarez");
                    p.setApMaterno("Martinez");
                    p.setEdad(30);
                    p.setSexo("Femenino");
                    p.setTelefono(811123456);
                    p.setCalle("Madrid");
                    p.setNumero(987);
                    p.setColonia("Nogalar");
                    p.setMunicipio("San Nicolas");
                    p.setCiudad("Nuevo Leon");
                    p.setCp(44556);
                    p.setServicioSocial(2345678);         
                   
                    System.out.println("Seleccionaste la opcion 3 - Crear una cita");
                    Cita c  = new Cita();
                    c.setIdCita(89);
                    c.setMedico(m);
                    c.setPaciente(p);
                    c.setFecha(05/12/2021);
                    save(c);
}

    public static void save(Cita c) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(c);
            System.out.println(json);
        } catch (Exception e) {
            System.out.println("Error->" + e.getMessage());
        }
    }
    
    public static void load() {
        String json = "{\"id\":1,\"nombreCita\":\"Cita numero 1\",\"fecha\":\"05/12/2021\",\"medico\":{\"id\":1,\"nombre\":\"Ytzel\",\"especialidad\":\"Cardiologa\"},\"paciente\":{\"id\":89,\"nombre\":\"Maria\"}}";
        System.out.println("load " + json);
        Gson gson = new Gson();
        Cita cita = gson.fromJson(json, Cita.class);

        System.out.println("nombre del paciente:" + cita.getPaciente().getNombre());
    }

}