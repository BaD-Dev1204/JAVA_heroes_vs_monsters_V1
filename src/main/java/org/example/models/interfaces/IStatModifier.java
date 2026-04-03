package org.example.models.interfaces;

import org.example.models.character.Character;

public interface IStatModifier {
    public int modify(int value, Character user, Character target);
}


