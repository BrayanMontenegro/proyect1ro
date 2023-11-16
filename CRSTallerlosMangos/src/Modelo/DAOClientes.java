package Modelo;

import java.util.*;
import javax.swing.table.DefaultTableModel;


/*** @author TallerlosMangos
 */
public class DAOClientes {
    
    
    public Clientes Insertar(String nombres, String apellidos, String tipo_cliente,
            String telefono, String cedula, String municipio, String sexo ) {
     String transaccion ="INSERT INTO Clientes (nombres,apellidos,tipo_cliente,"
        + "telefono,cedula,municipio,sexo) VALUES ('"
                + nombres + "', '" 
                + apellidos + "', '"
                + tipo_cliente + "', '"
                + telefono + "', '"
                + cedula + "', '"
                + municipio + "', '"
                + sexo + "')";
        
        if (new DataBase().Actualizar(transaccion)>0){
                return new Clientes(nombres, apellidos, tipo_cliente,
                        telefono, cedula , municipio, sexo);
                }
        return null;                
        }   
    
   public List<Clientes> buscar(String nombres, String apellidos,  String telefono, String cedula, String municipio) {
    String transaccion = "SELECT * FROM clientes WHERE ";
    List<String> condiciones = new ArrayList<>();

    if (nombres != null && !nombres.isEmpty()) {
        condiciones.add("nombres = '" + nombres + "'");
    }
    if (apellidos != null && !apellidos.isEmpty()) {
        condiciones.add("apellidos = '" + apellidos + "'");
    }
    
    if (telefono != null && !telefono.isEmpty()) {
        condiciones.add("telefono = '" + telefono + "'");
    }
    if (cedula != null && !cedula.isEmpty()) {
        condiciones.add("cedula = '" + cedula + "'");
    }
    if (municipio != null && !municipio.isEmpty()) {
        condiciones.add("municipio = '" + municipio + "'");
    }
    

    // Si no se proporcionan condiciones, retornar una lista vacía
    if (condiciones.isEmpty()) {
        return new ArrayList<>();
    }

    transaccion += String.join(" AND ", condiciones);

    // Ejecutar la consulta y procesar los resultados
    List<Map<String, Object>> registros = new DataBase().Listar(transaccion);
    List<Clientes> clientes = new ArrayList<>();

    for (Map<String, Object> registro : registros) {
        Clientes cli = new Clientes(
                (int) registro.get("id_cliente"),
                (String) registro.get("nombres"),
                (String) registro.get("apellidos"),
                (String) registro.get("tipo_cliente"),
                (String) registro.get("telefono"),
                (String) registro.get("cedula"),
                (String) registro.get("municipio"),
                (String) registro.get("sexo")
        );
        clientes.add(cli);
    }

    return clientes;
}



public int Actualizar(int id,String nombres,String apellidos,String tipo_cliente,
            String telefono,String cedula,String municipio,String sexo ) {
        String transaccion ="UPDATE Clientes SET nombres='"
                + nombres + "', apellidos='"
                + apellidos + "', tipo_cliente='"
                + tipo_cliente + "', telefono='"
                + telefono + "', cedula='"
                + cedula + "', municipio='"
                + municipio + "', sexo='"
                + sexo + "' WHERE id_cliente="
                + id ;       
        
        return new DataBase().Actualizar(transaccion);
    }
public List obtenerDatos() {
        String transaccion = "select * from clientes";
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Clientes> cliente = new ArrayList();
        for (Map registro : registros){
            Clientes cli = new Clientes ((int) registro.get("id_cliente"),
            (String) registro.get("nombres"),
            (String) registro.get("apellidos"),
            (String) registro.get("tipo_cliente"), 
            (String) registro.get("telefono"),  
            (String) registro.get("cedula"),
            (String) registro.get("municipio"),
            (String) registro.get("sexo"));
        cliente.add(cli);    
        }
    return cliente;
    }
public int Eliminar(int id) {
        String transaccion = "delete from clientes where id_cliente='"+ id +"'";
        return new DataBase().Actualizar(transaccion);
    }

}
              