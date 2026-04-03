package org.example.models.skill.skillsList;

import org.example.models.effect.effectType.DamageEffect;
import org.example.models.skill.Skill;
import org.example.models.stat.multiplier.StrengthMultiplier;

public class FireBall extends Skill {
    private int damage;
    private double strenghtPercentageMultiplier;
    public FireBall() {
        super(
                "Boule de feu",
                "L'attaque de base du magicien, consiste à concentrer son mana dans sa baguette et puis envoyer cette masse d'énergie vers l'avant.");

        DamageEffect damageEffect = new DamageEffect(this.getDamage());
        damageEffect.addModifier(new StrengthMultiplier(getStrenghtPercentageMultiplier()));

    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public double getStrenghtPercentageMultiplier() {
        return strenghtPercentageMultiplier;
    }

    public void setStrenghtPercentageMultiplier(double strenghtPercentageMultiplier) {
        this.strenghtPercentageMultiplier = strenghtPercentageMultiplier;
    }
}
