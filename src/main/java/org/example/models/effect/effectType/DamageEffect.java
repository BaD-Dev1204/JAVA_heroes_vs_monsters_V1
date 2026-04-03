package org.example.models.effect.effectType;

import org.example.models.character.Character;
import org.example.models.effect.Effect;

public class DamageEffect extends Effect {

    private int damage;

    public DamageEffect(int damage){
        this.setDamage(damage);
    }

    public void apply(Character user, Character target) {
        int finalDamage = applyModifiers(this.getDamage(), user, target);
        target.takeDamage(finalDamage);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
