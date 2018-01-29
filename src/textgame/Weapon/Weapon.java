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
public abstract class Weapon {
    protected int damage, level, baseDamage;
    protected String name;

    public Weapon(int level) {
        damage = baseDamage + level;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
    
    
}
