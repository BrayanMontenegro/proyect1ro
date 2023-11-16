package Modelo;

/*** @author TallerlosMangos
 */
public class Recursos {
    private int Id_recursos;
    private String N_recurso;

    public Recursos(int Id_recursos, String N_recurso) {
        this.Id_recursos = Id_recursos;
        this.N_recurso = N_recurso;
    }

    public Recursos(String N_recurso) {
        this.N_recurso = N_recurso;
    }

    public int getId_recursos() {
        return Id_recursos;
    }

    public void setId_recursos(int Id_recursos) {
        this.Id_recursos = Id_recursos;
    }

    public String getN_recurso() {
        return N_recurso;
    }

    public void setN_recurso(String N_recurso) {
        this.N_recurso = N_recurso;
    }

    }

 
