package org.example.models.hero;

import org.example.models.character.Character;
import org.example.models.skill.Skill;

import java.util.ArrayList;
import java.util.List;

public class Hero extends Character {

    private int gold;
    private int level;
    private int xp;
    private int bonusMaxHp;
    private int bonusStrength;
    private int bonusSpeed;
    private int bonusLuck;
    private List<Skill> skills = new ArrayList<>();

    public Hero() {
        super();

        setGold(0);
        setLevel(1);
        setXp(0);

        setBonusMaxHp(0);
        setBonusStrength(0);
        setBonusSpeed(0);
        setBonusLuck(0);
    }

    // 🔹 GETTERS AVEC BONUS

    @Override
    public int getMaxHp() {
        return super.getMaxHp() + bonusMaxHp;
    }

    @Override
    public int getStrength() {
        return super.getStrength() + bonusStrength;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + bonusSpeed;
    }

    @Override
    public int getLuck() {
        return super.getLuck() + bonusLuck;
    }

    // 🔹 SETTERS BONUS

    public void setBonusMaxHp(int bonusMaxHp) {
        if (bonusMaxHp < 0) {
            throw new IllegalArgumentException("Bonus HP ne peut pas être négatif");
        }
        this.bonusMaxHp = bonusMaxHp;
    }

    public void setBonusStrength(int bonusStrength) {
        if (bonusStrength < 0) {
            throw new IllegalArgumentException("Bonus strength ne peut pas être négatif");
        }
        this.bonusStrength = bonusStrength;
    }

    public void setBonusSpeed(int bonusSpeed) {
        if (bonusSpeed < 0) {
            throw new IllegalArgumentException("Bonus speed ne peut pas être négatif");
        }
        this.bonusSpeed = bonusSpeed;
    }

    public void setBonusLuck(int bonusLuck) {
        if (bonusLuck < 0) {
            throw new IllegalArgumentException("Bonus luck ne peut pas être négatif");
        }
        this.bonusLuck = bonusLuck;
    }

    // 🔹 GOLD / LEVEL / XP

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        if (gold < 0) {
            throw new IllegalArgumentException("L'or ne peut pas être négatif");
        }
        this.gold = gold;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < this.level) {
            throw new IllegalArgumentException("Le niveau ne peut pas diminuer");
        }
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        if (xp < this.xp) {
            throw new IllegalArgumentException("L'XP ne peut pas diminuer");
        }
        this.xp = xp;
    }

    public List<Skill> getHeroSkills(){
        return this.skills;
    }

    public void setHeroSkills(List<Skill> skills) {
        if (skills == null) {
            throw new IllegalArgumentException("La liste de skills ne peut pas être nulle !");
        }

        for (Skill skill : skills) {
            if (skill == null) {
                throw new IllegalArgumentException("Un skill ne peut pas être nul !");
            }
        }

        this.skills = new ArrayList<>(skills);
    }


    public void gainXp(int xp) {
        setXp(this.xp + xp);
    }

    public void levelUp() {
        setLevel(this.level + 1);
    }

}