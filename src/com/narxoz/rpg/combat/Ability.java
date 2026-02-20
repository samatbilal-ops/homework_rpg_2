package com.narxoz.rpg.combat;

import com.narxoz.rpg.enemy.Enemy;

public interface Ability {
    String getName();
    int getDamage();
    int getManaCost();
    String getDescription();
    void execute(Enemy caster, Enemy target);
}