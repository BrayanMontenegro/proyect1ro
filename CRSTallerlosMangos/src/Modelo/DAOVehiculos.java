package Modelo;
import java.util.*;

/*** @author TallerlosMangos
 */
public class DAOVehiculos {
    public Vehiculos Insertar(String n_placa, String color, String marca, int id_cliente) {
String transaccion ="INSERT INTO Vehiculos(n_placa,color,marca,id_cliente) VALUES ('"
                + n_placa + "', '" 
                + color + "', '"
                + marca + "', '"
                + id_cliente + "')";
        
        if (new DataBase().Actualizar(transaccion)>0){
                return new Vehiculos(n_placa, color, marca, id_cliente);
                }
        return null; 
    }

public int Actualizar(int id,String n_placa,String color,String marca,int id_cliente ) {
        String transaccion ="UPDATE Vehiculos SET nombres='"
                + n_placa + "', color='"
                + color + "', Marca= '"
                + marca + "', id_cliente='"
                + id_cliente + "', WHERE id_vehiculo="
                + id ;       
        
        return new DataBase().Actualizar(transaccion);
    }
public List obtenerDatos() {
        String transaccion = "select * from vehiculos";
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Vehiculos> vehiculo = new ArrayList();
        for (Map registro : registros){
            Vehiculos veh = new Vehiculos ((int) registro.get("id_vehiculo"),
            (String) registro.get("n_placa"),
            (String) registro.get("color"),
            (String) registro.get("marca"),
             (int) registro.get("id_cliente"));
        vehiculo.add(veh);    
        }
    return vehiculo;
    }
public int Eliminar(int id) {
        String transaccion = "delete from vehiculos where id_vehiculo='"+ id +"'";
        return new DataBase().Actualizar(transaccion);
    }

    public int Actualizar(int id, String plac, String col, String mar, String idc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Vehiculos Insertar(String plac, String col, String mar, String idc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}