/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import javax.swing.JPanel;

/**
 *
 * Unmodified from the professor's lite version of the app.
 */
public class ColorCanvas extends JPanel implements ColorListener {

    @Override
    public void changeColor(ColorEvent ce) {
        //this.setBackground
        setBackground(ce.getColor());
    }

    //constructor; and initiate the super class 
    public ColorCanvas() {
        super();
        setBackground(java.awt.Color.BLACK);
    }
}
