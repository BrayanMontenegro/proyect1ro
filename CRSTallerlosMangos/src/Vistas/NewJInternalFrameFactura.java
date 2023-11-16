package Vistas;
import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/*** @author TallerlosMangos
 */
public class NewJInternalFrameFactura extends javax.swing.JInternalFrame {

    /***/
    public NewJInternalFrameFactura() {
        initComponents();
        jTextIdFactura.setEnabled(false);    
    }
    public void limpiarCampos(){
        jTextIdFactura.setText("");
        jTextFecha.setText("");
        jTextFecha_entrada.setText("");
        jTextFecha_salida.setText("");
        jTextCosto.setText("");
        jTextId_Cliente.setText("");
        jTextIdModoPago.setText("");
        jTextIdEmpleado.setText("");
    }
     public void obtenerDatos(){ 
        List<Factura> facturacion=new DAOFactura().obtenerDatos();
        DefaultTableModel modelo= new DefaultTableModel();
        String[] columnas ={"id_factura","fecha", "fecha_entrada","fecha_salida",
            "costo","id_cliente","id_modopago","id_empleado"};
        modelo.setColumnIdentifiers(columnas);
        for(Factura fac:facturacion){ 
        String[]renglon={Integer.toString(fac.getId_factura()),
        fac.getFecha().toString(),fac.getFecha_entrada().toString(),
        fac.getFecha_salida().toString(),fac.getCosto().toString(),
        Integer.toString(fac.getId_cliente()),Integer.toString(fac.getId_modopago()),
        Integer.toString(fac.getId_empleado())};
            modelo.addRow(renglon);   
        }
        jTable_Factura.setModel(modelo); 
        
   }

    /***/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextIdFactura = new javax.swing.JTextField();
        jTextFecha = new javax.swing.JTextField();
        jTextFecha_entrada = new javax.swing.JTextField();
        jTextFecha_salida = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextCosto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextId_Cliente = new javax.swing.JTextField();
        jTextIdEmpleado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextIdModoPago = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jBAgregar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Factura = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Factura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Fecha");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("ID _Factura");

        jTextFecha_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFecha_entradaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Fecha de salida");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Fecha de entrada");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Costo");

        jTextCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCostoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("ID Cliente");

        jTextId_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextId_ClienteActionPerformed(evt);
            }
        });

        jTextIdEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdEmpleadoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("ID Empleado");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("ID Modo de pago");

        jTextIdModoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdModoPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTextIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFecha_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jTextFecha_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextId_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextIdModoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jTextIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFecha_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFecha_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextId_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIdModoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transacciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jBAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/agregar.png"))); // NOI18N
        jBAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/editar.png"))); // NOI18N
        jBEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditarActionPerformed(evt);
            }
        });

        jBactualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actualizar.png"))); // NOI18N
        jBactualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/eliminar.png"))); // NOI18N
        jBBorrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/buscar.png"))); // NOI18N
        jBBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .addComponent(jBEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(jBBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextBuscar)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBAgregar)
                    .addComponent(jBactualizar))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBEditar)
                    .addComponent(jBBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Factura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

        jTable_Factura.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable_Factura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable_Factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Fecha Entrada", "Fecha Salida", "Costo", "ID Cliente", "ID Modo Pago", "ID Empleado"
            }
        ));
        jTable_Factura.setGridColor(new java.awt.Color(0, 153, 102));
        jScrollPane1.setViewportView(jTable_Factura);

        jPanel4.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
         String fec=jTextFecha.getText();
         String fece=jTextFecha_entrada.getText();
         String fecs=jTextFecha_salida.getText();
         String cos=jTextCosto.getText();
         String idc=jTextId_Cliente.getText();
         String idm=jTextIdModoPago.getText();
         String ide=jTextIdEmpleado.getToolTipText();
         
        if(fec.contentEquals("")||fece.contentEquals("")||
          fecs.contentEquals("")||cos.contentEquals("")||idc.contentEquals("")|| 
                  idm.contentEquals("")||ide.contentEquals("")){
             JOptionPane.showMessageDialog(rootPane, 
                     "Todos los campos son obligatorios llenar");
    }else{
       try{
           
      java.sql.Date fech=java.sql.Date.valueOf(fec);
      java.sql.Date.valueOf(fece); java.sql.Date.valueOf(fecs);
      Factura fac=new DAOFactura().Insertar(fec, fece, fecs, cos, idc, idm, ide);
             JOptionPane.showMessageDialog(rootPane, "Registro agregado");
             }catch (Exception e){
                 e.printStackTrace();
                 JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
             }
         }
         obtenerDatos(); 
         limpiarCampos();  
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int fila=this.jTable_Factura.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        }
        else{
                 try{
int id=Integer.parseInt((String)this.jTable_Factura.getValueAt(fila, 0).toString());
Date fec=Date.valueOf((String)this.jTable_Factura.getValueAt(fila,1).toString());
Date fece=Date.valueOf((String)this.jTable_Factura.getValueAt(fila,2).toString());
Date fecs=Date.valueOf((String)this.jTable_Factura.getValueAt(fila,3).toString());
String cos=(String)this.jTable_Factura.getValueAt(fila,4);
String idc=(String)this.jTable_Factura.getValueAt(fila,5);
String idm=(String)this.jTable_Factura.getValueAt(fila,6);
String ide=(String)this.jTable_Factura.getValueAt(fila,7).toString();
             
                jTextIdFactura.setText(""+id);
                jTextFecha.setText(String.valueOf(fec));
                jTextFecha_entrada.setText(String.valueOf(fece));
                jTextFecha_salida.setText(String.valueOf(fecs));
                jTextCosto.setText(cos);
                jTextId_Cliente.setText(idc);
                jTextIdModoPago.setText(idm);
                jTextIdEmpleado.setText(ide);
                }catch(NumberFormatException e){
                    e.printStackTrace();
                }
        }    
    }    
        public void actualizarFactura(){
        int id=Integer.parseInt(this.jTextIdFactura.getText());
        String fec=this.jTextFecha.getText();
        String fece=this.jTextFecha_entrada.getText();
        String fecs=this.jTextFecha_salida.getText();
        String cos=this.jTextCosto.getText();
        String idc=this.jTextId_Cliente.getText();
        String idm=this.jTextFecha_salida.getText();
        String ide=this.jTextIdEmpleado.getText();
        
        DAOFactura dao=new DAOFactura();
        int fac=dao.Actualizar(id, fec, fece, fecs, cos, idc, idm, ide);
        if(fac==1){
            JOptionPane.showMessageDialog(rootPane, "¡Factura Actualizado!");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "¡Ocurrió un ERROR!");  
            }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
       actualizarFactura();
        obtenerDatos();
        limpiarCampos();   
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        int fila=this.jTable_Factura.getSelectedRow();
        if(fila==-1){ 
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");   
        }
        else{
            int id=Integer.parseInt((String)this.jTable_Factura.getValueAt(fila, 0).toString());
            DAOFactura dao=new DAOFactura();
            dao.Eliminar(id);
            obtenerDatos();
        } 
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jTextFecha_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFecha_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFecha_entradaActionPerformed

    private void jTextCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCostoActionPerformed

    private void jTextId_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextId_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextId_ClienteActionPerformed

    private void jTextIdEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdEmpleadoActionPerformed

    private void jTextIdModoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdModoPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdModoPagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Factura;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextCosto;
    private javax.swing.JTextField jTextFecha;
    private javax.swing.JTextField jTextFecha_entrada;
    private javax.swing.JTextField jTextFecha_salida;
    private javax.swing.JTextField jTextIdEmpleado;
    private javax.swing.JTextField jTextIdFactura;
    private javax.swing.JTextField jTextIdModoPago;
    private javax.swing.JTextField jTextId_Cliente;
    // End of variables declaration//GEN-END:variables
}
