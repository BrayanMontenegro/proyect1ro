package Modelo;

/*** @author TallerlosMangos
 */
public class Empleados {
    private int id_Empledo;
    private String Nombres;
    private String Apellidos;
    private String especalidad;
    private String telefono;
    private String Cedula;
    private String Edad;

    public Empleados(int id_Empledo, String Nombres, String Apellidos, String especalidad, String telefono, String Cedula, String Edad) {
        this.id_Empledo = id_Empledo;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.especalidad = especalidad;
        this.telefono = telefono;
        this.Cedula = Cedula;
        this.Edad = Edad;
    }

    public Empleados(String Nombres, String Apellidos, String especalidad, String telefono, String Cedula, String Edad) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.especalidad = especalidad;
        this.telefono = telefono;
        this.Cedula = Cedula;
        this.Edad = Edad;
    }

    public int getId_Empledo() {
        return id_Empledo;
    }

    public void setId_Empledo(int id_Empledo) {
        this.id_Empledo = id_Empledo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEspecalidad() {
        return especalidad;
    }

    public void setEspecalidad(String especalidad) {
        this.especalidad = especalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    }

    

    
  
