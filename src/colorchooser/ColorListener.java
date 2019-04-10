/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorchooser;

import java.util.*;

/**
 *
 * @author Ryan
 */
public interface ColorListener extends EventListener {

    public void changeColor(ColorEvent ce);
}
