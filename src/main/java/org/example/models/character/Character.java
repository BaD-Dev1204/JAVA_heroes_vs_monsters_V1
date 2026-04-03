package org.example.models.character;

public abstract class Character {

    private int maxHp;
    private int currentHp;
    private int strength;
    private int speed;
    private int luck;

    public Character() {
        setMaxHp(10);
        setCurrentHp(getMaxHp());
        setStrength(5);
        setSpeed(5);
        setLuck(5);
    }

    // =========================
    // GETTERS
    // =========================

    public int getMaxHp() {
        return maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getStrength() {
        return strength;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLuck() {
        return luck;
    }

    // =========================
    // SETTERS
    // =========================

    public void setMaxHp(int maxHp) {
        if (maxHp < 0) {
            throw new IllegalArgumentException("Les points de vie maximum ne peuvent pas être négatifs !");
        }
        this.maxHp = maxHp;

        // Ajuste currentHp si nécessaire
        if (currentHp > maxHp) {
            currentHp = maxHp;
        }
    }

    public void setCurrentHp(int currentHp) {
        if (currentHp < 0) {
            throw new IllegalArgumentException("Les points de vie actuels ne peuvent pas être négatifs !");
        }
        if (currentHp > this.maxHp) {
            throw new IllegalArgumentException("Les points de vie actuels ne peuvent pas dépasser les points de vie maximum");
        }
        this.currentHp = currentHp;
    }

    public void setStrength(int strength) {
        if (strength < 0) {
            throw new IllegalArgumentException("Les points de force ne peuvent pas être négatifs !");
        }
        this.strength = strength;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("Les points de vitesse ne peuvent pas être négatifs !");
        }
        this.speed = speed;
    }

    public void setLuck(int luck) {
        if (luck < 0) {
            throw new IllegalArgumentException("Les points de chance ne peuvent pas être négatifs !");
        }
        this.luck = luck;
    }

    // =========================
    // LOGIQUE
    // =========================

    public void takeDamage(int dmg) {
        int newHp = getCurrentHp() - dmg;
        setCurrentHp(Math.max(newHp, 0));
    }
}