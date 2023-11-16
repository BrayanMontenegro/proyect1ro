package Vistas;
import Modelo.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/*** @author TallerlosMangos
 */
public class NewJInternalFrameEmpleados extends javax.swing.JInternalFrame {

    /*** Creates new form NewJInternalFrameRegistroEmpleados
     */
    public NewJInternalFrameEmpleados() {
        initComponents();
        jTextIdEmpleado.setEnabled(false); 
    }
    public void limpiarCampos(){
        jTextIdEmpleado.setText("");
        jTextNombres.setText("");
        jTextApellidos.setText("");
        jComboBoxEspesialidad.getSelectedItem().toString();
        jTextelefono.setText("");
        jTextCedula.setText("");
        jText_Edad.setText("");
    }
    
    public void obtenerDatos(){ 
        List<Empleados> empleado=new DAOEmpleados().obtenerDatos();
        DefaultTableModel modelo= new DefaultTableModel();
        String[] columnas ={"id_empleado","nombres", "apellidos","especialidad",
            "telefono","cedula", "edad"};
        modelo.setColumnIdentifiers(columnas);
        for(Empleados emp:empleado){ 
            String[]renglon={Integer.toString(emp.getId_Empledo()),emp.getNombres(),
                emp.getApellidos(),emp.getEspecalidad(), emp.getTelefono(), emp.getCedula(),
                emp.getEdad().toString()};
            modelo.addRow(renglon);   
        }
        jTable_Empleado.setModel(modelo); 

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
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextelefono = new javax.swing.JTextField();
        jTextCedula = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextIdEmpleado = new javax.swing.JTextField();
        jText_Edad = new javax.swing.JTextField();
        jTextApellidos = new javax.swing.JTextField();
        jTextNombres = new javax.swing.JTextField();
        jComboBoxEspesialidad = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jBAgregar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Empleado = new javax.swing.JTable();

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
                .addContainerGap(486, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Empleado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nombres");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Apellidos");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Cedula");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("N°Telefono");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("ID Empleado");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Especialidad");

        jTextCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCedulaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Edad");

        jComboBoxEspesialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Mecánica", "Electricidad" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxEspesialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)))))
                    .addComponent(jLabel10)
                    .addComponent(jText_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEspesialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
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
        jBEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Indira\\Desktop\\CasoFarmacia-main\\Repositorio-Farmacia-Rosales.-main\\src\\Vistas_Iconos\\editar.png")); // NOI18N
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
        jBBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Indira\\Documents\\NetBeansProjects\\CRSTallerlosMangos\\src\\Icon\\Buscar Empleados.png")); // NOI18N
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBEditar)
                    .addComponent(jBBorrar))
                .addGap(42, 42, 42)
                .addComponent(jBBuscar)
                .addGap(18, 18, 18)
                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Empleados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel7.setLayout(new javax.swing.OverlayLayout(jPanel7));

        jTable_Empleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable_Empleado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable_Empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombres", "Apellidos", "Especialidad", "N°Telefonico", "Cédula", "Edad"
            }
        ));
        jTable_Empleado.setGridColor(new java.awt.Color(0, 153, 102));
        jScrollPane1.setViewportView(jTable_Empleado);

        jPanel7.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
         String nomb=jTextNombres.getText();
         String apell=jTextApellidos.getText();
         String esp=jComboBoxEspesialidad.getSelectedItem().toString();
         String tel=jTextelefono.getText();
         String ced=jTextCedula.getText();
         String ed=jText_Edad.getText();
         
          if(nomb.contentEquals("")||apell.contentEquals("")||
            esp.contentEquals("")||tel.contentEquals("")|| 
                  ced.equals("")||ed.contentEquals("")){
             JOptionPane.showMessageDialog(rootPane, 
                     "Todos los campos son obligatorios llenar");
         }else{
             try{
             Empleados emp=new DAOEmpleados().Insertar(nomb, apell, esp, tel, ced, ed);
             JOptionPane.showMessageDialog(rootPane, "Empleado agregado");
             }catch (Exception e){
                 e.printStackTrace();
                 JOptionPane.showMessageDialog(rootPane, "No se agrego el registro");
             }
         }
         obtenerDatos(); 
         limpiarCampos();                     
    }//GEN-LAST:event_jBAgregarActionPerformed

    private void jBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditarActionPerformed
        int fila=this.jTable_Empleado.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");
        }
        else{
                 try{
                int id=Integer.parseInt((String)this.jTable_Empleado.getValueAt(fila, 0).toString());
                String nom=(String)this.jTable_Empleado.getValueAt(fila,1);
                String apell=(String)this.jTable_Empleado.getValueAt(fila,2);
                String esp=(String)this.jTable_Empleado.getValueAt(fila,3);
                String tel=(String)this.jTable_Empleado.getValueAt(fila,4);
                String ced=(String)this.jTable_Empleado.getValueAt(fila,5);
                String ed=(String)this.jTable_Empleado.getValueAt(fila,6).toString();
             
                jTextIdEmpleado.setText(""+id);
                jTextNombres.setText(nom);
                jTextApellidos.setText(apell);
                jComboBoxEspesialidad.setToolTipText(esp);
                jTextelefono.setText(tel);
                jTextCedula.setText(ced);
                jText_Edad.setText(ed);
                }catch(NumberFormatException e){
                    e.printStackTrace();
                }
        }    
   }   
        public void actualizarEmpleados(){
        int id=Integer.parseInt(this.jTextIdEmpleado.getText());
        String nom=this.jTextNombres.getText();
        String apell=this.jTextApellidos.getText();
        String esp=(String)this.jComboBoxEspesialidad.getSelectedItem();
        String tel=this.jTextelefono.getText();
        String ced=this.jTextCedula.getText();
        String ed=this.jText_Edad.getText();
        
        DAOEmpleados dao=new DAOEmpleados();
        int dos=dao.Actualizar(id,nom,apell,esp,tel,ced,ed);
        if(dos==1){
            JOptionPane.showMessageDialog(rootPane, "¡Empleado Actualizado!");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "¡Ocurrió un ERROR!");  
            }
    }//GEN-LAST:event_jBEditarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jTextCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCedulaActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        int fila=this.jTable_Empleado.getSelectedRow();
        if(fila==-1){ 
            JOptionPane.showMessageDialog(rootPane, "Seleccione un registro de la tabla");   
        }
        else{
            int id=Integer.parseInt((String)this.jTable_Empleado.getValueAt(fila, 0).toString());
            DAOEmpleados dao=new DAOEmpleados();
            dao.Eliminar(id);
            obtenerDatos();
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        actualizarEmpleados();
        obtenerDatos();
        limpiarCampos();
    }//GEN-LAST:event_jBactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JComboBox<String> jComboBoxEspesialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Empleado;
    private javax.swing.JTextField jTextApellidos;
    private javax.swing.JTextField jTextBuscar;
    private javax.swing.JTextField jTextCedula;
    private javax.swing.JTextField jTextIdEmpleado;
    private javax.swing.JTextField jTextNombres;
    private javax.swing.JTextField jText_Edad;
    private javax.swing.JTextField jTextelefono;
    // End of variables declaration//GEN-END:variables

}
