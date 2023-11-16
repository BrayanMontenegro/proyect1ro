package Modelo;

/*** @author TallerlosMangos
 */
public class Clientes {
    private int id_cliente;
    private String nombres;
    private String apellidos;
    private String tipo_cliente;
    private String telefono;
    private String cedula;
    private String municipio;
    private String sexo;

    public Clientes(int id_cliente, String nombres, String apellidos, String tipo_cliente, String telefono, String cedula, String municipio, String sexo) {
        this.id_cliente = id_cliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipo_cliente = tipo_cliente;
        this.telefono = telefono;
        this.cedula = cedula;
        this.municipio = municipio;
        this.sexo = sexo;
    }

    public Clientes(String nombres, String apellidos, String tipo_cliente, String telefono, String cedula, String municipio, String sexo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipo_cliente = tipo_cliente;
        this.telefono = telefono;
        this.cedula = cedula;
        this.municipio = municipio;
        this.sexo = sexo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    }
