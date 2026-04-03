package org.example.models.skill.skillsList;

import org.example.models.effect.effectType.DamageEffect;
import org.example.models.skill.Skill;
import org.example.models.stat.multiplier.StrengthMultiplier;

public class Slash extends Skill {

    private int damage;
    private double strenghtPercentageMultiplier;

    public Slash(){
        super("Slash","Compétence de base du chevalier, consiste à donner un coup d'épée classique");
        this.setDamage(10);
        this.setStrenghtPercentageMultiplier(0.5);
        DamageEffect damageEffect =new DamageEffect(this.getDamage());
        damageEffect.addModifier(new StrengthMultiplier(this.getStrenghtPercentageMultiplier()));
    }

    public double getStrenghtPercentageMultiplier() {
        return strenghtPercentageMultiplier;
    }

    public void setStrenghtPercentageMultiplier(double strenghtPercentageMultiplier) {
        this.strenghtPercentageMultiplier = strenghtPercentageMultiplier;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
