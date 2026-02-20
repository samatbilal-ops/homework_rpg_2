package com.narxoz.rpg.combat;


public interface Ability extends Cloneable {

    String getName();

    int getDamage();

    AbilityType getType();

    String getDescription();

    Ability clone();
}