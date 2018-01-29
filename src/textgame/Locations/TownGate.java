/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgame.Locations;

import textgame.Message;

/**
 *
 * @author James
 */
public class TownGate extends Location{

    public TownGate(String text, String option1, String option2, String option3) {
        super(text, option1, option2, option3);
    }
    
    @Override
    public void perform1(){
        Message.popup("You can't mate", "Gaurd");
    }
    @Override
    public void perform2(){
        
    }
    @Override
    public void perform3(){
        Message.popup("You can't leave man! The game has just started!", "God");
    }
    
}
