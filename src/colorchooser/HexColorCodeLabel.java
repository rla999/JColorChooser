/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import javax.swing.JLabel;

/**
 *
 * @author Ryan
 */
public class HexColorCodeLabel extends JLabel implements ColorListener {

    @Override
    public void changeColor(ColorEvent ce) {
        String red = Integer.toHexString(ce.getColor().getRed());
        if (red.length() < 2) {
            red = "0" + red;
        }
        String green = Integer.toHexString(ce.getColor().getGreen());
        if (green.length() < 2) {
            green = "0" + green;
        }
        String blue = Integer.toHexString(ce.getColor().getBlue());
        if (blue.length() < 2) {
            blue = "0" + blue;
        }
        setText("Hexademical Color: #" + red + green + blue);
    }

    public HexColorCodeLabel() {
        super("Hexademical Color: #000000");
    }

}
