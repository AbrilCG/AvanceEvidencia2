/**
 *@author LyrisseC
 */
public class Medico {
   private int idMedico;
   private String nombre; 
   private String apPaterno;
   private String apMaterno;
   private int edad;
   private String sexo;
   private int telefono;
   private String calle;
   private int numero; 
   private String colonia;  
   private String municipio;
   private String ciudad; 
   private int cp;
   private int noCedula;
   private String especialidad;
   
   public Medico(){
       
   }
   
   public Medico(int idMedico, String nombre, String apMaterno, String apPaterno, int edad, String sexo, int telefono, String calle, int numero, String colonia, String municipio, String ciudad, int cp, int noCedula, String especialidad){
       this.idMedico=idMedico;
       this.nombre=nombre;
       this.apPaterno=apPaterno;
       this.apMaterno=apMaterno;
       this.edad=edad;
       this.sexo=sexo;
       this.telefono=telefono;
       this.calle=calle;
       this.numero=numero;
       this.colonia=colonia;
       this.municipio=municipio;
       this.ciudad=ciudad;
       this.cp=cp;
       this.noCedula=noCedula;
       this.especialidad=especialidad; 
   }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getNoCedula() {
        return noCedula;
    }

    public void setNoCedula(int noCedula) {
        this.noCedula = noCedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
   
   
}
