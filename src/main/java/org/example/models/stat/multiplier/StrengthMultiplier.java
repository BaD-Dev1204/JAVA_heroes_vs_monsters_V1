package org.example.models.stat.multiplier;

import org.example.models.character.Character;
import org.example.models.interfaces.IStatModifier;

public class StrengthMultiplier implements IStatModifier {

    private double percentage;

    public StrengthMultiplier(double percentage){
        this.setPercentage(percentage);
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public int modify(int value, Character user, Character target) {
        // On multiplie et on arrondit à l'entier
        double strengthScaling = user.getStrength() * 0.01;
        return (int) (value * (1 + strengthScaling * this.getPercentage()));
    }
}
