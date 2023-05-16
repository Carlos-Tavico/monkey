/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package monkey;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class MeIn extends javax.swing.JFrame {
public static int tiempoInventario = 0, tiempoProduccion = 0, tiempoEmpaquetado = 0, tiempoSalida = 0;
public static int costoInventario = 0, costoProduccion = 0, costoEmpaquetado = 0, costoSalida = 0;
    /**
     * Creates new form NewJFrame
     */
    public MeIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Monkey");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaInventario = new javax.swing.JLabel();
        etiquetaProduccion = new javax.swing.JLabel();
        etiquetaEmpaquetado = new javax.swing.JLabel();
        etiquetaSalida = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        etiquetaCosto = new javax.swing.JLabel();
        textTiempoInventario = new javax.swing.JTextField();
        textTiempoProduccion = new javax.swing.JTextField();
        textTiempoEmpaquetado = new javax.swing.JTextField();
        textTiempoSalida = new javax.swing.JTextField();
        textCostoInventario = new javax.swing.JTextField();
        textCostoProduccion = new javax.swing.JTextField();
        textCostoEmpaquetado = new javax.swing.JTextField();
        textCostoSalida = new javax.swing.JTextField();
        botonInciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaTitulo.setText("Bienvenido a Monkey");

        etiquetaInventario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaInventario.setText("Inventario");

        etiquetaProduccion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaProduccion.setText("Producción");

        etiquetaEmpaquetado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaEmpaquetado.setText("Empaquetado");

        etiquetaSalida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaSalida.setText("Salida");

        etiquetaTiempo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaTiempo.setText("Tiempo (s)");

        etiquetaCosto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiquetaCosto.setText("Costo (Q/s)");

        textTiempoInventario.setText("5");

        textTiempoProduccion.setText("10");

        textTiempoEmpaquetado.setText("15");
        textTiempoEmpaquetado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTiempoEmpaquetadoActionPerformed(evt);
            }
        });

        textTiempoSalida.setText("20");

        textCostoProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCostoProduccionActionPerformed(evt);
            }
        });

        botonInciar.setText("Iniciar simulación");
        botonInciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaInventario)
                            .addComponent(etiquetaProduccion)
                            .addComponent(etiquetaEmpaquetado)
                            .addComponent(etiquetaSalida))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textTiempoInventario)
                            .addComponent(textTiempoProduccion)
                            .addComponent(textTiempoEmpaquetado)
                            .addComponent(textTiempoSalida))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaCosto)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textCostoSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addComponent(textCostoEmpaquetado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textCostoProduccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textCostoInventario, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonInciar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(etiquetaTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTiempo)
                    .addComponent(etiquetaCosto))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaInventario)
                    .addComponent(textTiempoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCostoInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaProduccion)
                    .addComponent(textTiempoProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCostoProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEmpaquetado)
                    .addComponent(textTiempoEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCostoEmpaquetado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSalida)
                    .addComponent(textTiempoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCostoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(botonInciar)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInciarActionPerformed
        // TODO add your handling code here:
        if(textTiempoInventario.getText()==""||textTiempoProduccion.getText()==""
                ||textTiempoEmpaquetado.getText()==""||textTiempoSalida.getText()==""
                ||textCostoInventario.getText()==""||textCostoProduccion.getText()==""
                ||textCostoEmpaquetado.getText()==""||textCostoSalida.getText()==""){
            JOptionPane.showMessageDialog(this, "Llene todas las casillas");
        }else{
            tiempoInventario = Integer.parseInt(textTiempoInventario.getText());
            tiempoProduccion = Integer.parseInt(textTiempoProduccion.getText());
            tiempoEmpaquetado = Integer.parseInt(textTiempoEmpaquetado.getText());
            tiempoSalida = Integer.parseInt(textTiempoSalida.getText());
            costoInventario = Integer.parseInt(textCostoInventario.getText());
            costoProduccion = Integer.parseInt(textCostoProduccion.getText());
            costoEmpaquetado = Integer.parseInt(textCostoEmpaquetado.getText());
            costoSalida = Integer.parseInt(textCostoSalida.getText());
            Simulacion sim = new Simulacion();
            this.setVisible(false);
            sim.setVisible(true);
        
        }
    }//GEN-LAST:event_botonInciarActionPerformed

    private void textCostoProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCostoProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCostoProduccionActionPerformed

    private void textTiempoEmpaquetadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTiempoEmpaquetadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTiempoEmpaquetadoActionPerformed

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
            java.util.logging.Logger.getLogger(MeIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MeIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MeIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MeIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInciar;
    private javax.swing.JLabel etiquetaCosto;
    private javax.swing.JLabel etiquetaEmpaquetado;
    private javax.swing.JLabel etiquetaInventario;
    private javax.swing.JLabel etiquetaProduccion;
    private javax.swing.JLabel etiquetaSalida;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JTextField textCostoEmpaquetado;
    private javax.swing.JTextField textCostoInventario;
    private javax.swing.JTextField textCostoProduccion;
    private javax.swing.JTextField textCostoSalida;
    private javax.swing.JTextField textTiempoEmpaquetado;
    private javax.swing.JTextField textTiempoInventario;
    private javax.swing.JTextField textTiempoProduccion;
    private javax.swing.JTextField textTiempoSalida;
    // End of variables declaration//GEN-END:variables
}