/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgame;

import javax.swing.JOptionPane;

/**
 *
 * @author James
 */
public class Message {
    
    public static void popup(String message, String person){
        JOptionPane.showMessageDialog(null, message, person + " says:", 1);
    }
}
