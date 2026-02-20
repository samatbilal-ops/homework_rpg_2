package com.narxoz.rpg.combat;

import com.narxoz.rpg.enemy.Enemy;

public class FrostNova implements Ability {
    private String name = "Frost Nova";
    private int damage = 80;
    private int manaCost = 60;
    private String description = "Ice explosion";

    @Override
    public String getName() { return name; }

    @Override
    public int getDamage() { return damage; }

    @Override
    public int getManaCost() { return manaCost; }

    @Override
    public String getDescription() { return description; }

    @Override
    public void execute(Enemy caster, Enemy target) {
        System.out.println(caster.getName() + " uses " + name + "!");
        target.takeDamage(damage);
    }
}