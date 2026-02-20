package com.narxoz.rpg.enemy;

import java.util.List;
import java.util.Map;

public interface Enemy extends Cloneable {
    String getName();
    void setName(String name);

    int getHealth();
    void setHealth(int health);

    int getDamage();
    void setDamage(int damage);

    int getDefense();
    void setDefense(int defense);

    int getSpeed();
    void setSpeed(int speed);

    String getElement();
    void setElement(String element);

    List<String> getAbilities();
    void setAbilities(List<String> abilities);

    Map<String, Integer> getLootTable();
    void setLootTable(Map<String, Integer> lootTable);

    String getAiBehavior();
    void setAiBehavior(String aiBehavior);

    Enemy clone();
    void takeDamage(int damage);
    boolean isAlive();
    void attack(Enemy target);
    void displayInfo();
}