/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import javax.swing.JLabel;

/**
 *
 * Ryan was the sole author of the hexadecimal color code label as this was the
 * task that he agreed to take on initially before he had to worry about the
 * headaches of integrating components.
 */
public class HexColorCodeLabel extends JLabel implements ColorListener {

    @Override
    //When a change in the color is detected, update the hex label which is built by converting the RGB numbers into hex and putting them together in front of a #
    public void changeColor(ColorEvent ce) {
        String red = Integer.toHexString(ce.getColor().getRed());//Luckily there is a built in method to the Integer class for converting to hex.
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
        setText("Hexademical Color: #" + red + green + blue);//Set the label. Example label    Hexadecimal Color: #FFFFFF
    }

    public HexColorCodeLabel() {
        super("Hexademical Color: #000000");//This matches the idea that the default color is pure black and #000000 is the correct matching hex code.
    }

}
