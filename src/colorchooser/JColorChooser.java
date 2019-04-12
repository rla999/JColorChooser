/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import java.awt.Color;

/**
 *
 * @author 01824456
 */
public class JColorChooser extends javax.swing.JFrame {

    Color color;

    /**
     * Creates new form JColorChooser
     */
    public JColorChooser() {
        initComponents();
        color = colorCanvas.getBackground();
//        colorChooser.addColorListener(colorLabel);
        colorChooser.addColorListener(colorCanvas);
        colorChooser.addColorListener(lblHexColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        colorCanvas = new colorchooser.ColorCanvas();
        jPanel2 = new javax.swing.JPanel();
        colorChooser = new colorchooser.ColorChooser();
        jPanel3 = new javax.swing.JPanel();
        colorLabel = new colorchooser.ColorLabel();
        lblHexColor = new colorchooser.HexColorCodeLabel();
        jLabel1 = new javax.swing.JLabel();
        btnChangeColor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout colorCanvasLayout = new javax.swing.GroupLayout(colorCanvas);
        colorCanvas.setLayout(colorCanvasLayout);
        colorCanvasLayout.setHorizontalGroup(
            colorCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        colorCanvasLayout.setVerticalGroup(
            colorCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(colorCanvas, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(colorChooser, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(2, 2, 6, 6));

        colorLabel.setText("Red: 0 Green: 0  Blue: 0 ");
        jPanel3.add(colorLabel);
        jPanel3.add(lblHexColor);
        jPanel3.add(jLabel1);

        btnChangeColor.setText("Change Color");
        jPanel3.add(btnChangeColor);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JColorChooser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JColorChooser().setVisible(true);
            }
        });
    }

    public Color getColor() {
        return color;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeColor;
    private colorchooser.ColorCanvas colorCanvas;
    private colorchooser.ColorChooser colorChooser;
    private colorchooser.ColorLabel colorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private colorchooser.HexColorCodeLabel lblHexColor;
    // End of variables declaration//GEN-END:variables
}
