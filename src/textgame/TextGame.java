/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgame;

import textgame.Characters.Player;
import textgame.Locations.Location;
import textgame.Locations.TownGate;

/**
 *
 * @author James
 */
public class TextGame {
    
    public Player player;
    Location towngate = new TownGate("You are at the town gate, there is a single gaurd and no other visible entrance.","Ask gaurd to let you in","Attack gaurd","leave");
    
    public static void main(String[] args) {
        MainMenu main = new MainMenu();
        main.setVisible(true);
    }
    
    public void init(){
        System.out.println("Welcome to Adventure!");
        player = new Player(10,1);
        player.setLocation(towngate);
        run();
    }
    public void run(){
            ActionBox box = new ActionBox(player.getLocation());
            box.setVisible(true);
            //haha
    }
    
}
