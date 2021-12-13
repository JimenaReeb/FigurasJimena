package figuras;

public class Main extends javax.swing.JFrame {

    private int figure;

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        lblAltura.setVisible(false);
        txtAltura.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlParametros = new javax.swing.JPanel();
        lblRadio = new javax.swing.JLabel();
        lblAltura = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        btnDibujar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        pnlOperaciones = new javax.swing.JPanel();
        lblPerimetro = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        txtPerimetro = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        pnlCanvas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mnbMain = new javax.swing.JMenuBar();
        mnuFiguras = new javax.swing.JMenu();
        mnicirculo = new javax.swing.JMenuItem();
        mniCuadrado = new javax.swing.JMenuItem();
        mniTriangulo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Figuras");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlParametros.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros"));

        lblRadio.setText("Radio");

        lblAltura.setText("Altura");

        txtAltura.setMinimumSize(new java.awt.Dimension(10, 20));

        javax.swing.GroupLayout pnlParametrosLayout = new javax.swing.GroupLayout(pnlParametros);
        pnlParametros.setLayout(pnlParametrosLayout);
        pnlParametrosLayout.setHorizontalGroup(
            pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAltura)
                    .addComponent(lblRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRadio, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlParametrosLayout.setVerticalGroup(
            pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParametrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRadio)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlParametrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAltura))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(pnlParametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlParametros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnDibujar.setText("Dibujar");
        btnDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDibujarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");

        pnlOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        lblPerimetro.setText("Perimetro");

        lblArea.setText("Area");

        javax.swing.GroupLayout pnlOperacionesLayout = new javax.swing.GroupLayout(pnlOperaciones);
        pnlOperaciones.setLayout(pnlOperacionesLayout);
        pnlOperacionesLayout.setHorizontalGroup(
            pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPerimetro)
                    .addComponent(lblArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArea)
                    .addComponent(txtPerimetro))
                .addContainerGap())
        );
        pnlOperacionesLayout.setVerticalGroup(
            pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOperacionesLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPerimetro)
                    .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArea)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pnlCanvas.setBackground(new java.awt.Color(204, 204, 255));
        pnlCanvas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 2, true));

        javax.swing.GroupLayout pnlCanvasLayout = new javax.swing.GroupLayout(pnlCanvas);
        pnlCanvas.setLayout(pnlCanvasLayout);
        pnlCanvasLayout.setHorizontalGroup(
            pnlCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlCanvasLayout.setVerticalGroup(
            pnlCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );

        jLabel1.setText("Para dibujar una figura en el lienzo,eligela en \"Figuras\" y  escribe un radio o perímetro y presiona \"Dibujar\"");

        mnuFiguras.setText("Figuras");
        mnuFiguras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFigurasActionPerformed(evt);
            }
        });

        mnicirculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnicirculo.setText("Circulo");
        mnicirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnicirculoActionPerformed(evt);
            }
        });
        mnuFiguras.add(mnicirculo);

        mniCuadrado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mniCuadrado.setText("Cuadrado");
        mniCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCuadradoActionPerformed(evt);
            }
        });
        mnuFiguras.add(mniCuadrado);

        mniTriangulo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mniTriangulo.setText("Triangulo");
        mniTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTrianguloActionPerformed(evt);
            }
        });
        mnuFiguras.add(mniTriangulo);

        mnbMain.add(mnuFiguras);

        setJMenuBar(mnbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDibujar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrar)))
                .addGap(20, 20, 20)
                .addComponent(pnlCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDibujar)
                    .addComponent(btnBorrar))
                .addGap(18, 18, 18)
                .addComponent(pnlOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDibujarActionPerformed
        Circulo circulo;
        Cuadrado cuadrado;
        if(figure==0){
            circulo = new Circulo(Integer.parseInt(txtRadio.getText()));
        txtPerimetro.setText(Float.toString(circulo.Area()));
        circulo.drawFigure(pnlCanvas.getGraphics());
        }else if(figure==1){
            cuadrado = new Cuadrado(Integer.parseInt(txtRadio.getText()));
        txtPerimetro.setText(Float.toString(cuadrado.Perimetro()));
        txtArea.setText(Float.toString(cuadrado.Area()));
        cuadrado.drawFigure(pnlCanvas.getGraphics());
        }
        
    }//GEN-LAST:event_btnDibujarActionPerformed

    private void mniTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniTrianguloActionPerformed

    private void mniCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCuadradoActionPerformed
       if(evt.getSource().equals(mniCuadrado)){
           figure=1;
           lblAltura.setVisible(false);
           txtAltura.setVisible(false);
           lblRadio.setText("Lado");
       }
    }//GEN-LAST:event_mniCuadradoActionPerformed

    private void mnuFigurasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFigurasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuFigurasActionPerformed

    private void mnicirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnicirculoActionPerformed
        Object circulo = null;
        if (evt.getSource().equals(circulo)) {
            figure = 0;
            lblAltura.setVisible(false);
            txtAltura.setVisible(false);
            lblRadio.setText("Radio");
        }
    }//GEN-LAST:event_mnicirculoActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBorrar;
    public static javax.swing.JButton btnDibujar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lblAltura;
    public javax.swing.JLabel lblArea;
    public javax.swing.JLabel lblPerimetro;
    public javax.swing.JLabel lblRadio;
    private javax.swing.JMenuBar mnbMain;
    private javax.swing.JMenuItem mniCuadrado;
    private javax.swing.JMenuItem mniTriangulo;
    private javax.swing.JMenuItem mnicirculo;
    private javax.swing.JMenu mnuFiguras;
    public javax.swing.JPanel pnlCanvas;
    private javax.swing.JPanel pnlOperaciones;
    private javax.swing.JPanel pnlParametros;
    public javax.swing.JTextField txtAltura;
    public javax.swing.JTextField txtArea;
    public javax.swing.JTextField txtPerimetro;
    public javax.swing.JTextField txtRadio;
    // End of variables declaration//GEN-END:variables
}
