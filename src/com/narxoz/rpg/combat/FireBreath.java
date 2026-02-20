package com.narxoz.rpg.combat;

import com.narxoz.rpg.enemy.Enemy;

public class FireBreath implements Ability {
    private String name = "Fire Breath";
    private int damage = 150;
    private int manaCost = 50;
    private String description = "Breathes powerful fire";

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