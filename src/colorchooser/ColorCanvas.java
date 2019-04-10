/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import javax.swing.JPanel;

/**
 *
 * @author 00220682
 */
public class ColorCanvas extends JPanel implements ColorListener {

    @Override
    public void changeColor(ColorEvent ce) {
        setBackground(ce.getColor());
    }

    public ColorCanvas() {
        super();
        setBackground(java.awt.Color.BLACK);
    }

}
