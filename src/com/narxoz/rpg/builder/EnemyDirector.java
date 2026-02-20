package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.factory.EnemyComponentFactory;

public class EnemyDirector {
    private EnemyBuilder builder;

    public EnemyDirector(EnemyBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(EnemyBuilder builder) {
        this.builder = builder;
    }

    public Enemy constructBasicGoblin(String name) {
        return builder.reset()
                .setName(name)
                .setHealth(100)
                .setDamage(15)
                .setDefense(5)
                .setSpeed(20)
                .build();
    }

    public Enemy constructEliteGoblin(String name) {
        return builder.reset()
                .setName(name)
                .setHealth(200)
                .setDamage(30)
                .setDefense(15)
                .setSpeed(25)
                .build();
    }

    public Enemy constructFireDragon(String name, EnemyComponentFactory factory) {
        return builder.reset()
                .setName(name)
                .setHealth(5000)
                .setDamage(200)
                .setDefense(100)
                .setSpeed(30)
                .setFactory(factory)
                .build();
    }
}