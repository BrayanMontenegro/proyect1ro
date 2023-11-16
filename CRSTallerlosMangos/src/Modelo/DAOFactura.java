package Modelo;
import java.util.*;

/*** @author TallerlosMangos
 */
public class DAOFactura {
    public Factura Insertar(java.sql.Date fecha, java.sql.Date fecha_entrada, 
            java.sql.Date fecha_salida, Float costo, int id_cliente, 
            int id_modopago, int id_empleado ) {
    String transaccion ="INSERT INTO Factura (fecha,fecha_entrada,fecha_salida,"
        + "costo,id_cliente,id_modopago,id_empleado) VALUES ('"
                + fecha + "', '" 
                + fecha_entrada + "', '"
                + fecha_salida + "', '"
                + costo + "', '"
                + id_cliente + "', '"
                + id_modopago + "', '"
                + id_empleado + "')";
        
        if (new DataBase().Actualizar(transaccion)>0){
                return new Factura(fecha, fecha_entrada, fecha_salida,
                        costo, id_cliente , id_modopago, id_empleado);
                }
        return null;                
        }
public int Actualizar(int id,java.sql.Date fecha,java.sql.Date fecha_entrada, 
            java.sql.Date fecha_salida,Float costo,int id_cliente, 
            int id_modopago, int id_empleado ) {
        String transaccion ="UPDATE Factura SET nombres='"
                + fecha + "', fecha_entrada='"
                + fecha_entrada + "', fecha_salida='"
                + fecha_salida + "', costo='"
                + costo + "', id_cliente='"
                + id_cliente + "', id_modopago='"
                + id_modopago + "', id_empleado='"
                + id_empleado + "' WHERE id_factura="
                + id ;       
        
        return new DataBase().Actualizar(transaccion);
    }
public List obtenerDatos() {
        String transaccion = "select * from facturacion";
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Factura> factura = new ArrayList();
        for (Map registro : registros){
            Factura fac = new Factura ((int) registro.get("id_factura"),
            (Date) registro.get("fecha"),
            (Date) registro.get("fecha_entrada"),
            (Date) registro.get("fecha_salida"), 
            (float) registro.get("costo"),  
            (int) registro.get("id_cliente"),
            (int) registro.get("id_modopago"),
            (int) registro.get("id_empleado"));
        factura.add(fac);    
        }
    return factura;
    }
public int Eliminar(int id) {
        String transaccion = "delete from facturacion where id_factura='"+ id +"'";
        return new DataBase().Actualizar(transaccion);
    }

    public int Actualizar(int id, String fec, String fece, String fecs, String cos, int id0, int id1, int id2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int Actualizar(int id, String fec, String fece, String fecs, String cos, String idc, String idm, String ide) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Factura Insertar(String fec, String fece, String fecs, String cos, String idc, String idm, String ide) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
