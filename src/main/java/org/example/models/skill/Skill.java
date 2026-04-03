package org.example.models.skill;
import org.example.models.character.Character;
import org.example.models.interfaces.IEffect;
import java.util.ArrayList;
import java.util.List;

public class Skill {
    private String name;
    private String description;
    private List<IEffect> effects;

    public Skill(String name, String description){
        this.setName(name);
        this.setDescription(description);
        this.setEffects(new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<IEffect> getEffects() {
        return effects;
    }

    public void setEffects(List<IEffect> effects) {
        this.effects = effects;
    }

    public void use(Character user, Character target){
        for (IEffect effect : effects){
            effect.apply(user, target);
        }
    }

}
