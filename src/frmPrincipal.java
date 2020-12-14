
public class frmPrincipal extends javax.swing.JFrame {

   
    public frmPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuClientes = new javax.swing.JMenuItem();
        MenuPelicula = new javax.swing.JMenuItem();
        menuVendedores = new javax.swing.JMenuItem();
        menuBuscarVenta = new javax.swing.JMenuItem();
        matriculas = new javax.swing.JMenu();
        menuTickets = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuFunciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Cinema de Culto");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/movie-time-cinema-logo-8B5BE91828-seeklogo.com.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/filmstrip-160562_640.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        Panel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Panel.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(114, 114, 114)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addContainerGap(118, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("Administación");

        MenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pelicula.png"))); // NOI18N
        MenuClientes.setText("Agregar Cliente");
        MenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientesActionPerformed(evt);
            }
        });
        jMenu1.add(MenuClientes);

        MenuPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/claqueta (1).png"))); // NOI18N
        MenuPelicula.setText("Agregar Película");
        MenuPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPeliculaActionPerformed(evt);
            }
        });
        jMenu1.add(MenuPelicula);

        menuVendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/agente-de-centro-de-llamadas.png"))); // NOI18N
        menuVendedores.setText("Agregar Vendedor");
        menuVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendedoresActionPerformed(evt);
            }
        });
        jMenu1.add(menuVendedores);

        menuBuscarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/taquilla.png"))); // NOI18N
        menuBuscarVenta.setText("Buscar Ventas");
        menuBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBuscarVentaActionPerformed(evt);
            }
        });
        jMenu1.add(menuBuscarVenta);

        jMenuBar1.add(jMenu1);

        matriculas.setText("Boletería");

        menuTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/boleto (1).png"))); // NOI18N
        menuTickets.setText("Venta de Tickets");
        menuTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTicketsActionPerformed(evt);
            }
        });
        matriculas.add(menuTickets);

        jMenuBar1.add(matriculas);

        jMenu2.setText("Cartelera");

        menuFunciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/carrete-de-pelicula.png"))); // NOI18N
        menuFunciones.setText("Funciones");
        menuFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionesActionPerformed(evt);
            }
        });
        jMenu2.add(menuFunciones);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientesActionPerformed
        frmClientes fc = new frmClientes();
        Panel.add(fc);
        fc.setVisible(true);
    }//GEN-LAST:event_MenuClientesActionPerformed

    private void MenuPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPeliculaActionPerformed
        frmPeliculas fp = new frmPeliculas();
        Panel.add(fp);
        fp.setVisible(true);
    }//GEN-LAST:event_MenuPeliculaActionPerformed

    private void menuTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTicketsActionPerformed
        frmTickets ft = new frmTickets();
        Panel.add(ft);
        ft.setVisible(true);
    }//GEN-LAST:event_menuTicketsActionPerformed

    private void menuBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBuscarVentaActionPerformed
        frmBuscarVentas fv = new frmBuscarVentas();
        Panel.add(fv);
        fv.setVisible(true);
    }//GEN-LAST:event_menuBuscarVentaActionPerformed

    private void menuFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionesActionPerformed
        frmCartelera ff = new frmCartelera();
        Panel.add(ff);
        ff.setVisible(true);
    }//GEN-LAST:event_menuFuncionesActionPerformed

    private void menuVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendedoresActionPerformed
        frmVendedores fvr = new frmVendedores();
        Panel.add(fvr);
        fvr.setVisible(true);
    }//GEN-LAST:event_menuVendedoresActionPerformed


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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuClientes;
    private javax.swing.JMenuItem MenuPelicula;
    private javax.swing.JDesktopPane Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu matriculas;
    private javax.swing.JMenuItem menuBuscarVenta;
    private javax.swing.JMenuItem menuFunciones;
    private javax.swing.JMenuItem menuTickets;
    private javax.swing.JMenuItem menuVendedores;
    // End of variables declaration//GEN-END:variables
}
