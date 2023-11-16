package Controlador;
import Vistas.*;

/*** @author TallerlosMangos
 */
public class SistemaRegistrosMDI extends javax.swing.JFrame {
             
             private NewJInternalFrameRegistroClientes Cliente;
             private NewJInternalFrameEmpleados Empleado;
             private NewJInternalFrameRegistroVehiculos Vehiculo;
             private NewJInternalFrameRegistroRecursos Recurso;
             private NewJInternalFrameFactura Factura;
             
    /****/
    public SistemaRegistrosMDI() {
        initComponents();
        setTitle("Registros");
        Cliente=new NewJInternalFrameRegistroClientes();
        desktopPane.add(Cliente);
        
        Empleado=new NewJInternalFrameEmpleados();
        desktopPane.add(Empleado);
        
        Vehiculo=new NewJInternalFrameRegistroVehiculos();
        desktopPane.add(Vehiculo);
        
        Recurso=new NewJInternalFrameRegistroRecursos();
        desktopPane.add(Recurso);
        
        Factura=new NewJInternalFrameFactura();
        desktopPane.add(Factura);
    }

    /***/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jButton_Recurso = new javax.swing.JButton();
        jButton_Empleado = new javax.swing.JButton();
        jButton_Vehículo = new javax.swing.JButton();
        jButton_Cliente = new javax.swing.JButton();
        jButton_Factura = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 153, 102));
        jPanel5.setForeground(new java.awt.Color(0, 153, 102));

        jPanel14.setBackground(new java.awt.Color(204, 255, 204));

        jButton_Recurso.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Recurso.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton_Recurso.setIcon(new javax.swing.ImageIcon("C:\\Users\\Indira\\Documents\\NetBeansProjects\\CRSTallerlosMangos\\src\\Icon\\Agregar Recursos MDI.png")); // NOI18N
        jButton_Recurso.setText("Recursos");
        jButton_Recurso.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton_Recurso.setBorderPainted(false);
        jButton_Recurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RecursoActionPerformed(evt);
            }
        });

        jButton_Empleado.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Empleado.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton_Empleado.setIcon(new javax.swing.ImageIcon("C:\\Users\\Indira\\Documents\\NetBeansProjects\\CRSTallerlosMangos\\src\\Icon\\Agregar Empleados MDI.png")); // NOI18N
        jButton_Empleado.setText("Empleados");
        jButton_Empleado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton_Empleado.setBorderPainted(false);
        jButton_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EmpleadoActionPerformed(evt);
            }
        });

        jButton_Vehículo.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Vehículo.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton_Vehículo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/agregar vehiculos MDI.png"))); // NOI18N
        jButton_Vehículo.setText("Vehículos");
        jButton_Vehículo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton_Vehículo.setBorderPainted(false);
        jButton_Vehículo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VehículoActionPerformed(evt);
            }
        });

        jButton_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Cliente.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton_Cliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\Indira\\Documents\\NetBeansProjects\\CRSTallerlosMangos\\src\\Icon\\Agregar Clientes MDI.png")); // NOI18N
        jButton_Cliente.setText("Clientes");
        jButton_Cliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton_Cliente.setBorderPainted(false);
        jButton_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClientesActionPerformed(evt);
            }
        });

        jButton_Factura.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Factura.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton_Factura.setIcon(new javax.swing.ImageIcon("C:\\Users\\Indira\\Documents\\NetBeansProjects\\CRSTallerlosMangos\\src\\Icon\\facturaMDI.png")); // NOI18N
        jButton_Factura.setText("Factura");
        jButton_Factura.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton_Factura.setBorderPainted(false);
        jButton_Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FacturaActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButtonSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Indira\\Documents\\NetBeansProjects\\CRSTallerlosMangos\\src\\Icon\\Salir MDI.png")); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButtonSalir.setBorderPainted(false);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jButton_Recurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Vehículo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton_Factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Cliente)
                .addGap(18, 18, 18)
                .addComponent(jButton_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Vehículo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Recurso)
                .addGap(18, 18, 18)
                .addComponent(jButton_Factura)
                .addGap(165, 165, 165)
                .addComponent(jButtonSalir)
                .addContainerGap(572, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 677, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        desktopPane.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setForeground(new java.awt.Color(255, 255, 255));
        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClientesActionPerformed
          Cliente.obtenerDatos();
          Cliente.setVisible(true);
          int x=(desktopPane.getWidth()/2)- Cliente.getWidth()/2;
          int y=(desktopPane.getHeight()/2)- Cliente.getHeight()/2;
          Cliente.setLocation(x, y);
//        NewJInternalFrameRegistroClientes frmFrameRegistroClientes=new
//        NewJInternalFrameRegistroClientes(); desktopPane.add
//        (frmFrameRegistroClientes);frmFrameRegistroClientes.show();
    }//GEN-LAST:event_jButton_ClientesActionPerformed

    private void jButton_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EmpleadoActionPerformed
          Empleado.obtenerDatos();
          Empleado.setVisible(true);
          int x=(desktopPane.getWidth()/2)- Empleado.getWidth()/2;
          int y=(desktopPane.getHeight()/2)- Empleado.getHeight()/2;
          Empleado.setLocation(x, y);
//        NewJInternalFrameEmpleados frmFrameEmpleados=new
//        NewJInternalFrameEmpleados(); desktopPane.add
//        (frmFrameEmpleados);frmFrameEmpleados.show();
    }//GEN-LAST:event_jButton_EmpleadoActionPerformed

    private void jButton_VehículoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VehículoActionPerformed
        Vehiculo.obtenerDatos();
        Vehiculo.setVisible(true);
        int x=(desktopPane.getWidth()/2)- Vehiculo.getWidth()/2;
        int y=(desktopPane.getHeight()/2)- Vehiculo.getHeight()/2;
        Vehiculo.setLocation(x, y);
//        NewJInternalFrameRegistroVehiculos frmFrameRegistroVehiculos=new
//        NewJInternalFrameRegistroVehiculos();desktopPane.add
//        (frmFrameRegistroVehiculos);frmFrameRegistroVehiculos.show();
    }//GEN-LAST:event_jButton_VehículoActionPerformed

    private void jButton_RecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RecursoActionPerformed
        Recurso.obtenerDatos();
        Recurso.setVisible(true);
        int x=(desktopPane.getWidth()/2)- Empleado.getWidth()/2;
        int y=(desktopPane.getHeight()/2)- Empleado.getHeight()/2;
        Empleado.setLocation(x, y);
//        NewJInternalFrameRegistroRecursos frmFrameRegistroRecursos=new
//        NewJInternalFrameRegistroRecursos();desktopPane.add
//        (frmFrameRegistroRecursos);frmFrameRegistroRecursos.show();
        
    }//GEN-LAST:event_jButton_RecursoActionPerformed

    private void jButton_FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FacturaActionPerformed
        Factura.obtenerDatos();
        Factura.setVisible(true);
        int x=(desktopPane.getWidth()/2)- Factura.getWidth()/2;
        int y=(desktopPane.getHeight()/2)- Factura.getHeight()/2;
        Factura.setLocation(x, y);
//        NewJInternalFrameFactura frmFrameFactura=new
//        NewJInternalFrameFactura();desktopPane.add
//        frmFrameFactura);frmFrameFactura.show();
    }//GEN-LAST:event_jButton_FacturaActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    /*** @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemaRegistrosMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaRegistrosMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaRegistrosMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaRegistrosMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaRegistrosMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButton_Cliente;
    private javax.swing.JButton jButton_Empleado;
    private javax.swing.JButton jButton_Factura;
    private javax.swing.JButton jButton_Recurso;
    private javax.swing.JButton jButton_Vehículo;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
