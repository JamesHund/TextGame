/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgame.Characters;

import textgame.Weapon.Weapon;

/**
 *
 * @author James
 */
public abstract class Character {
    protected int health, maxhealth, level;
    protected Weapon weapon;
    
    protected Character(int maxhealth, int level){
        this.maxhealth = maxhealth;
        this.level = level;
    }
    protected void damage(int damage){
        health -= damage;
    }
    
}
