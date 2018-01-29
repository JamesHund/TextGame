/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgame.Weapon;

/**
 *
 * @author James
 */
public class Sword extends Weapon{
    public final int baseDamage = 1;
    public Sword(int level) {
        super(level);
        name = "Lvl " + this.level + " Sword";
    }
    
}
