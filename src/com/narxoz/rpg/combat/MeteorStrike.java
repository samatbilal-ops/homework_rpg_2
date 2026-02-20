package com.narxoz.rpg.combat;

import com.narxoz.rpg.enemy.Enemy;

public class MeteorStrike implements Ability {
    private String name = "Meteor Strike";
    private int damage = 300;
    private int manaCost = 100;
    private String description = "Calls a meteor";

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