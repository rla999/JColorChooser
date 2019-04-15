/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * Mostly unmodified from professor's version of the app. Ben and Ryan modified
 * this label to work with the test class.
 */
public class ColorLabel extends JLabel implements ColorListener {

    @Override
    public void changeColor(ColorEvent ce) {
        setForeground(ce.getColor());
    }

    //constructor
    public ColorLabel() {
        super();
        setText("Please click Choose Color and choose a color to see the effect.");
        setForeground(Color.BLACK);
    }
}
