package com.narxoz.rpg.combat;

import com.narxoz.rpg.enemy.Enemy;

public class IceShard implements Ability {
    private String name = "Ice Shard";
    private int damage = 120;
    private int manaCost = 40;
    private String description = "Launches ice shards";

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