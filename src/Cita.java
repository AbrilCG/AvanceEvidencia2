
import java.util.Date;
/**
 *
 * @author User
 */
public class Cita {

    private int idCita;
    private int fecha;
    private Medico medico; 
    private Paciente paciente; 

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int f) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
