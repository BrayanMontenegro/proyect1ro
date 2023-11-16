package Vistas;
import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/*** @author TallerlosMangos
 */
public class NewJInternalFrameRegistroVehiculos extends javax.swing.JInternalFrame {

    /*** Creates new form NewJInternalFrameRegistroVehiculos
     */
    public NewJInternalFrameRegistroVehiculos() {
        initComponents();
        jTextIdVehiculos.setEnabled(false); 
    }
        public void limpiarCampos(){
        jTextIdVehiculos.setText("");
        jTextN_placa.setText("");
        jTextColor.setText("");
        jTextMarca.setText("");
        jTextIdCliente.setText("");
    }
         public void obtenerDatos(){
        List<Vehiculos> vehiculo=new DAOVehiculos().obtenerDatos();
        DefaultTableModel modelo= new DefaultTableModel();
        String[] columnas ={"id_vehiculo","n_placa", "color","marca","id_cliente"}; 
        modelo.setColumnIdentifiers(columnas);
        for(Vehiculos veh:vehiculo){ 
            String[]renglon={Integer.toString(veh.getId_vehiculos()),
                veh.getN_Placa(),veh.getColor(),veh.getMarca(),veh.toString()};
            modelo.addRow(renglon);   
        }
        jTable_Vehículos.setModel(modelo); 
    }
         
    


    /***/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextColor = new javax.swing.JTextField();
        jTextIdVehiculos = new javax.swing.JTextField();
        jTextMarca = new javax.swing.JTextField();
        jTextN_placa = new javax.swing.JTextField();
        jTextIdCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBAgregar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Vehículos = new javax.swing.JTable();

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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Vehículos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("N_Placa");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Marca");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Color");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("ID Vehículos");

        jTextColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextColorActionPerformed(evt);
            }
        });

        jTextIdVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdVehiculosActionPerformed(evt);
            }
        });

        jTextMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMarcaActionPerformed(evt);
            }
        });

        jTextIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdClienteActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("ID Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextIdVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jTextN_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jTextIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextN_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextIdVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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
        jBactualizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Indira\\Desktop\\CasoFarmacia-main\\Repositorio-Farmacia-Rosales.-main\\src\\Vistas_Iconos\\Actualizar.png")); // NOI18N
        jBactualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });

        jBBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/eliminar.png"))); // NOI18N
        jBBorrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Indira\\Documents\\NetBeansProjects\\CRSTallerlosMangos\\src\\Icon\\buscar Vehiculo.png")); // NOI18N
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
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextBuscar)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBAgregar)
                    .addComponent(jBactualizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBEditar)
                    .addComponent(jBBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Vehículos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

        jTable_Vehículos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable_Vehículos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable_Vehículos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "N_Placa", "Color", "Marca", "ID Cliente"
            }
        ));
        jTable_Vehículos.setGridColor(new java.awt.Color(0, 153, 102));
        jScrollPane1.setViewportView(jTable_Vehículos);

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
                        .addGap(48, 48, 48)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextColorActionPerformed

    private void jTextMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMarcaActionPerformed

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
         String plac=jTextN_placa.getText();
         String col=jTextColor.getText();
         String mar=jTextMarca.getText();
         String idc=jTextIdCliente.getText();
         
    if(plac.contentEquals("")||col.contentEquals("")||mar.contentEquals("")||
            idc.contentEquals("")){
             JOptionPane.showMessageDialog(rootPane, 
                     "Todos los campos son obligatorios llenar");
             
         }else{
             try{
             Vehiculos veh=new DAOVehiculos().Insertar(plac, col, mar, idc);
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
        int fila=this.jTable_Vehículos.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        }
        else{
                try{
                int id=Integer.parseInt((String)this.jTable_Vehículos.getValueAt(fila, 0).toString());
                String plac=(String)this.jTable_Vehículos.getValueAt(fila,1);
                String col=(String)this.jTable_Vehículos.getValueAt(fila,2);
                String mar=(String)this.jTable_Vehículos.getValueAt(fila,3);
                String idc=(String)this.jTable_Vehículos.getValueAt(fila,4).toString();
             
                jTextIdVehiculos.setText(""+id);
                jTextN_placa.setText(plac);
                jTextColor.setText(col);
                jTextMarca.setText(mar);
                jTextIdCliente.setText(idc);
                }catch(NumberFormatException e){
                    e.printStackTrace();
                }
        }    
   }   
        public void actualizarVehículos(){
        int id=Integer.parseInt(this.jTextIdVehiculos.getText());
        String plac=this.jTextN_placa.getText();
        String col=this.jTextColor.getText();
        String mar=this.jTextMarca.getText();
        String idc=this.jTextIdCliente.getText();
        
        DAOVehiculos dao=new DAOVehiculos();
        int veh=dao.Actualizar(id, plac, col, mar, idc);
        if(veh==1){
            JOptionPane.showMessageDialog(rootPane, "¡Vehículo Actualizado!");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "¡Ocurrió un ERROR!");  
            }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        actualizarVehículos();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTextIdVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdVehiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdVehiculosActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        int fila=this.jTable_Vehículos.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        }
        else{
            int id=Integer.parseInt((String)this.jTable_Vehículos.getValueAt(fila, 0).toString());
            DAOVehiculos dao=new DAOVehiculos();
            dao.Eliminar(id);
            obtenerDatos();
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jTextIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Vehículos;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextColor;
    private javax.swing.JTextField jTextIdCliente;
    private javax.swing.JTextField jTextIdVehiculos;
    private javax.swing.JTextField jTextMarca;
    private javax.swing.JTextField jTextN_placa;
    // End of variables declaration//GEN-END:variables

}
