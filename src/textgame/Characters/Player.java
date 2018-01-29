/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgame.Characters;

import textgame.Locations.Location;

/**
 *
 * @author James
 */
public class Player extends Character {

    Location location;
    public Player(int maxhealth, int level) {
        super(maxhealth, level);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    
    
    
}
