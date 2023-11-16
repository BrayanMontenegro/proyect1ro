package Modelo;

/*** @author TallerlosMangos
 */
public class Vehiculos {
    private int id_vehiculos;
    private String N_Placa;
    private String Color;
    private String Marca;
    private int id_clintes;

    public Vehiculos(int id_vehiculos, String N_Placa, String Color, String Marca, int id_clintes) {
        this.id_vehiculos = id_vehiculos;
        this.N_Placa = N_Placa;
        this.Color = Color;
        this.Marca = Marca;
        this.id_clintes = id_clintes;
    }

    public Vehiculos(String N_Placa, String Color, String Marca, int id_clintes) {
        this.N_Placa = N_Placa;
        this.Color = Color;
        this.Marca = Marca;
        this.id_clintes = id_clintes;
    }

    public int getId_vehiculos() {
        return id_vehiculos;
    }

    public void setId_vehiculos(int id_vehiculos) {
        this.id_vehiculos = id_vehiculos;
    }

    public String getN_Placa() {
        return N_Placa;
    }

    public void setN_Placa(String N_Placa) {
        this.N_Placa = N_Placa;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getId_clintes() {
        return id_clintes;
    }

    public void setId_clintes(int id_clintes) {
        this.id_clintes = id_clintes;
    }

    }
   
    