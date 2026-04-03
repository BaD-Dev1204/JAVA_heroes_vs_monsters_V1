package org.example.models.effect;

import org.example.models.character.Character;
import org.example.models.interfaces.IEffect;
import org.example.models.interfaces.IStatModifier;

import java.util.ArrayList;
import java.util.List;

public abstract class Effect implements IEffect {

    private List<IStatModifier> modifiers = new ArrayList<>();

    public List<IStatModifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(List<IStatModifier> modifiers) {
        this.modifiers = modifiers;
    }

    public void addModifier(IStatModifier modifier) {
        this.getModifiers().add(modifier);
    }

    // Applique tous les modificateurs empilés sur la valeur
    public int applyModifiers(int value, Character user, Character target){
        int result = value;
        for (IStatModifier mod : this.getModifiers()){
            result = mod.modify(result, user, target);
        }
        return result;
    }

}
