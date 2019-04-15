/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Ryan
 */
public class ColorTextPanel extends javax.swing.JPanel implements ColorListener, ActionListener, KeyListener, DocumentListener {

    private Vector listeners;
    int errorDisplay = 0;

    /**
     * Creates new form ColorTextPanel
     */
    public ColorTextPanel() {
        initComponents();
        listeners = new Vector();
        txtRed.addActionListener(this);
        txtGreen.addActionListener(this);
        txtBlue.addActionListener(this);
        txtRed.addKeyListener(this);
        txtGreen.addKeyListener(this);
        txtBlue.addKeyListener(this);
        txtRed.getDocument().addDocumentListener(this);
        txtGreen.getDocument().addDocumentListener(this);
        txtBlue.getDocument().addDocumentListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRed = new colorchooser.JIntegerField();
        jLabel2 = new javax.swing.JLabel();
        txtGreen = new colorchooser.JIntegerField();
        jLabel3 = new javax.swing.JLabel();
        txtBlue = new colorchooser.JIntegerField();

        setLayout(new java.awt.GridLayout(3, 2, 3, 4));

        jLabel1.setText("Red:");
        add(jLabel1);
        add(txtRed);

        jLabel2.setText("Green:");
        add(jLabel2);
        add(txtGreen);

        jLabel3.setText("Blue:");
        add(jLabel3);
        add(txtBlue);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private colorchooser.JIntegerField txtBlue;
    private colorchooser.JIntegerField txtGreen;
    private colorchooser.JIntegerField txtRed;
    // End of variables declaration//GEN-END:variables

    @Override
    public void changeColor(ColorEvent ce) {
        txtRed.setText(Integer.toString(ce.getColor().getRed()));
        txtGreen.setText(Integer.toString(ce.getColor().getGreen()));
        txtBlue.setText((Integer.toString(ce.getColor().getBlue())));
    }

    private void fireColorEvent(ColorEvent colorEvent) {
        Vector v;
        synchronized (this) {
            v = (Vector) listeners.clone();
        }
        int size = v.size();
        for (int i = 0; i < size; i++) {
            ColorListener colorListener = (ColorListener) v.elementAt(i);
            colorListener.changeColor(colorEvent);
        }
    }

    public void fireColorEvent() {
        try {
            fireColorEvent(new ColorEvent(this, new Color(txtRed.getValue(), txtGreen.getValue(), txtBlue.getValue())));
        } catch (Exception e) {
            if (errorDisplay != 0) {
                errorDisplay = JOptionPane.showConfirmDialog(
                        null,
                        "Please enter a valid integer between 0-255!! Click no to stop receiving these warnings!",
                        "Invalid Data!",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );
            }
        }
    }

    public void addColorListener(ColorListener colorListener) {
        listeners.addElement(colorListener);
    }

    public void removeColorListener(ColorListener colorListener) {
        listeners.removeElement(colorListener);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        fireColorEvent();
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertUpdate(DocumentEvent arg0) {
        fireColorEvent();
    }

    @Override
    public void removeUpdate(DocumentEvent arg0) {
        fireColorEvent();
    }

    @Override
    public void changedUpdate(DocumentEvent arg0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
