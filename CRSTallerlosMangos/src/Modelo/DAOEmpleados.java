package Modelo;
import java.util.*;

/*** @author TallerlosMangos
 */
public class DAOEmpleados {
     public Empleados Insertar(String nombres, String apellidos, String especialidad, 
        String telefono, String cedula, String edad) {
String transaccion ="INSERT INTO Empleados (nombres,apellidos,especialidad,telefono,cedula,edad) VALUES ('"
                + nombres + "', '" 
                + apellidos + "', '"
                + especialidad + "', '"
                + telefono + "', '"
                + cedula + "', '"
                + edad + "')";
        
        if (new DataBase().Actualizar(transaccion)>0){
                return new Empleados(nombres, apellidos, especialidad, telefono, 
                        cedula, edad);
                }
        return null;                
        }    
     
public int Actualizar(int id,String nombres,String apellidos,String especialidad, 
        String telefono,String cedula,String edad ) {
        String transaccion ="UPDATE Empleados SET nombres='"
                + nombres + "', apellidos='"
                + apellidos + "', especialidad='"
                + especialidad + "', telefono='"
                + telefono + "', cedula='"
                + cedula + "', edad='"
                + edad + "' WHERE id_empleado="
                + id ;       
        
        return new DataBase().Actualizar(transaccion);
    }
public List obtenerDatos() {
        String transaccion = "select * from empleados";
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Empleados> empleado = new ArrayList();
        for (Map registro : registros){
            Empleados emp = new Empleados ((int) registro.get("id_empleado"),
            (String) registro.get("nombres"),
            (String) registro.get("apellidos"),
            (String) registro.get("especialidad"), 
            (String) registro.get("telefono"),  
            (String) registro.get("cedula"),
            (String) registro.get("edad"));
        empleado.add(emp);    
        }
    return empleado;
    }
public int Eliminar(int id) {
        String transaccion = "delete from empleados where id_empleado='"+ id +"'";
        return new DataBase().Actualizar(transaccion);
     }
}