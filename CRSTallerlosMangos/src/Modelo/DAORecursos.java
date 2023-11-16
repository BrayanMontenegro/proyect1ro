package Modelo;
import java.util.*;

/*** @author TallerlosMangos
 */
public class DAORecursos {
    public Recursos Insertar(String n_recurso) {
String transaccion ="INSERT INTO Recursos (n_recurso) VALUES ('"
                + n_recurso + "')";
        
        if (new DataBase().Actualizar(transaccion)>0) {
                return new Recursos(n_recurso);
                }
        return null;                
        }    
public int Actualizar(int id,String n_recurso) {
        String transaccion ="UPDATE Recursos SET nombres='"
                + n_recurso + "', WHERE id_recurso="
                + id ;       
        
        return new DataBase().Actualizar(transaccion);
    }
public List obtenerDatos() {
        String transaccion = "select * from recursos";
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Recursos> recurso = new ArrayList();
        for (Map registro : registros){
            Recursos re = new Recursos ((int) registro.get("id_recurso"),
            (String) registro.get("n_recurso"));
        recurso.add(re);    
        }
    return recurso;
    }
public int Eliminar(int id) {
        String transaccion = "delete from recursos where id_recurso='"+ id +"'";
        return new DataBase().Actualizar(transaccion);
    }
}
