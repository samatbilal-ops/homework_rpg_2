package com.narxoz.rpg.combat;

import com.narxoz.rpg.enemy.Enemy;

public class Nightmare implements Ability {
    private String name = "Nightmare";
    private int damage = 100;
    private int manaCost = 70;
    private String description = "Plunge into nightmare";

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