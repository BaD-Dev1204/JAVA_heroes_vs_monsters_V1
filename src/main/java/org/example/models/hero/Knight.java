package org.example.models.hero;

import org.example.models.skill.skillsList.Slash;

public class Knight extends Hero{

    public Knight(){
        super();
        this.setBonusMaxHp(10);
        this.setBonusStrength(5);

        this.getHeroSkills().add(new Slash());


    }
}
