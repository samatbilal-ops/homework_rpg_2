package com.narxoz.rpg.combat;

import com.narxoz.rpg.enemy.Enemy;

public class ShadowBolt implements Ability {
    private String name = "Shadow Bolt";
    private int damage = 140;
    private int manaCost = 45;
    private String description = "Shadow energy blast";

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