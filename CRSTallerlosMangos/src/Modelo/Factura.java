package Modelo;
import java.text.DecimalFormat;
import java.util.Date;

/*** @author TallerlosMangos
 */
public class Factura {
    private int id_factura;
    private Date fecha;
    private Date fecha_entrada;
    private Date fecha_salida;
    private Float costo;
    private int id_cliente;
    private int id_modopago;
    private int id_empleado;

    public Factura(int id_factura, Date fecha, Date fecha_entrada, Date fecha_salida, Float costo, int id_cliente, int id_modopago, int id_empleado) {
        this.id_factura = id_factura;
        this.fecha = fecha;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.costo = costo;
        this.id_cliente = id_cliente;
        this.id_modopago = id_modopago;
        this.id_empleado = id_empleado;
    }

    public Factura(Date fecha, Date fecha_entrada, Date fecha_salida, Float costo, int id_cliente, int id_modopago, int id_empleado) {
        this.fecha = fecha;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.costo = costo;
        this.id_cliente = id_cliente;
        this.id_modopago = id_modopago;
        this.id_empleado = id_empleado;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_modopago() {
        return id_modopago;
    }

    public void setId_modopago(int id_modopago) {
        this.id_modopago = id_modopago;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getfecha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    }