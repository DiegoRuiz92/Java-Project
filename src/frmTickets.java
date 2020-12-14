
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmTickets extends javax.swing.JInternalFrame {

    Conexion cc = null;
    Connection cn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    DefaultTableModel modelo = null;
    int total = 0;

    public frmTickets() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDocumentoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNombreCliente = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Documento = new javax.swing.JLabel();
        txtRefPelicula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnGenerarVenta = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnBuscarPelicula = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtDocumentoVendedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblNombreVendedor = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblCorreoVendedor = new javax.swing.JLabel();
        btnBuscarVendedor = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Documento");
        jLabel1.setToolTipText("");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jLabel2.setToolTipText("");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad");
        jLabel3.setToolTipText("");

        lblNombreCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(255, 255, 255));

        lblEdad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Correo");
        jLabel11.setToolTipText("");

        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarCliente)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Información Tickets", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cantidad", "Película", "Género", "Hora", "Precio", "Subtotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        Documento.setForeground(new java.awt.Color(255, 255, 255));
        Documento.setText("Código Película");

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));

        btnGenerarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/donacion.png"))); // NOI18N
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad Tickets");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total");

        btnBuscarPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        btnBuscarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPeliculaActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/escoba.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/salida (2).png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGenerarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(183, 183, 183)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRefPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Documento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnBuscarPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Documento)
                                    .addComponent(jLabel4))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRefPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnBuscarPelicula, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGenerarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)), "Vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setToolTipText("");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Documento");
        jLabel5.setToolTipText("");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre");
        jLabel7.setToolTipText("");

        lblNombreVendedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreVendedor.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Correo");
        jLabel12.setToolTipText("");

        lblCorreoVendedor.setForeground(new java.awt.Color(255, 255, 255));

        btnBuscarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        btnBuscarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtDocumentoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnBuscarVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(lblNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lblCorreoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarVendedor)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNombreVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDocumentoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreoVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed

        try {
            cc = new Conexion();
            cn = cc.conectar();
            ps = cn.prepareStatement("SELECT * FROM clientes WHERE documento_cliente = ?");
            ps.setString(1, txtDocumentoCliente.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                //txtDocumentoProfesor.setText(rs.getString("documento"));
                lblNombreCliente.setText(rs.getString("nombre_cliente"));
                lblEdad.setText(rs.getString("edad"));
                lblCorreo.setText(rs.getString("correo"));
                //lblSalario.setText(String.valueOf(Integer.parseInt(lblClasificacion.getText())*Integer.parseInt(txtEdad.getText())));

            } else {
                JOptionPane.showMessageDialog(null, "No existe la película en la base de datos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaEliminar = tabla.getSelectedRow();
        modelo.removeRow(filaEliminar);
        tabla.setModel(modelo);
        calcularTotal();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        if (!txtDocumentoVendedor.getText().isEmpty() && !txtDocumentoCliente.getText().isEmpty() && !txtRefPelicula.getText().isEmpty() && !txtCantidad.getText().isEmpty()) {
            cc = new Conexion();
            cn = cc.conectar();
            try {
                PreparedStatement ps = cn.prepareStatement("INSERT INTO venta VALUES (null,?,?)");
                ps.setString(1, txtDocumentoCliente.getText());
                ps.setString(2, txtDocumentoVendedor.getText());
                ps.executeUpdate();

                ps = cn.prepareStatement("SELECT MAX(id_venta) FROM venta");
                rs = ps.executeQuery();
                rs.next();
                int id_venta = rs.getInt(1);

                for (int i = 0; i < modelo.getRowCount(); i++) {

                    ps = cn.prepareStatement("INSERT INTO detalle_venta VALUES (null,?,?,?)");
                    ps.setInt(1, id_venta);
                    ps.setString(2, String.valueOf(modelo.getValueAt(i, 0)));
                    ps.setString(3, String.valueOf(modelo.getValueAt(i, 1)));
                    ps.executeUpdate();
                }

                JOptionPane.showMessageDialog(null, "Venta Generada");

            } catch (SQLException ex) {
                System.out.print(ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para facturar", "¡Atención!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    private void btnBuscarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPeliculaActionPerformed
        modelo = (DefaultTableModel) tabla.getModel();

        try {
            cc = new Conexion();
            cn = cc.conectar();
            ps = cn.prepareStatement("SELECT * FROM pelicula WHERE id_pelicula = ?");
            ps.setString(1, txtRefPelicula.getText());
            rs = ps.executeQuery();

            if (rs.next()) {

                String[] dato = new String[7];

                dato[0] = rs.getString("id_pelicula");
                dato[1] = txtCantidad.getText();
                dato[2] = rs.getString("nombre_pelicula");
                dato[3] = rs.getString("genero");
                dato[4] = rs.getString("hora");
                dato[5] = rs.getString("precio");
                dato[6] = String.valueOf(Integer.parseInt(dato[1]) * Integer.parseInt(dato[5]));

                modelo.addRow(dato);
                tabla.setModel(modelo);

                calcularTotal();
                //total += Integer.parseInt(dato[6]);
                lblTotal.setText(String.valueOf(total));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la película en la base de datos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnBuscarPeliculaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVendedorActionPerformed
        try {
            cc = new Conexion();
            cn = cc.conectar();
            ps = cn.prepareStatement("SELECT * FROM vendedores WHERE documento_vendedor = ?");
            ps.setString(1, txtDocumentoVendedor.getText());
            rs = ps.executeQuery();

            if (rs.next()) {
                lblNombreVendedor.setText(rs.getString("nombre_vendedor"));
                lblCorreoVendedor.setText(rs.getString("correo_vendedor"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el vendedor en la base de datos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnBuscarVendedorActionPerformed

    public void calcularTotal() {
        total = 0;
        for (int i = 0; i < tabla.getRowCount(); i++) {

            total += Integer.parseInt(tabla.getValueAt(i, 6).toString());
        }
        lblTotal.setText(String.valueOf(total));
    }


    public void limpiar() {
        txtDocumentoVendedor.setText(" ");
        txtRefPelicula.setText(" ");
        txtDocumentoCliente.setText("");
        lblEdad.setText("");
        lblNombreCliente.setText("");
        lblCorreo.setText("");
        txtCantidad.setText(" ");
        lblTotal.setText("");
        txtRefPelicula.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Documento;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarPelicula;
    private javax.swing.JButton btnBuscarVendedor;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreoVendedor;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNombreVendedor;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDocumentoCliente;
    private javax.swing.JTextField txtDocumentoVendedor;
    private javax.swing.JTextField txtRefPelicula;
    // End of variables declaration//GEN-END:variables
}
