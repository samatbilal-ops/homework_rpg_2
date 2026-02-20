package com.narxoz.rpg;

import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================");
        System.out.println("RPG ENEMY SYSTEM - HOMEWORK 2");
        System.out.println("=================================\n");

        // 1. Abstract Factory
        System.out.println("1. ABSTRACT FACTORY");
        System.out.println("--------------------");
        FireComponentFactory fireFactory = new FireComponentFactory();
        IceComponentFactory iceFactory = new IceComponentFactory();
        ShadowComponentFactory shadowFactory = new ShadowComponentFactory();

        System.out.println("Fire Factory: " + fireFactory.getElement());
        System.out.println("Ice Factory: " + iceFactory.getElement());
        System.out.println("Shadow Factory: " + shadowFactory.getElement());
        System.out.println();

        // 2. Builder + Director
        System.out.println("2. BUILDER + DIRECTOR");
        System.out.println("----------------------");

        GoblinBuilder goblinBuilder = new GoblinBuilder();
        EnemyDirector director = new EnemyDirector(goblinBuilder);

        Enemy basicGoblin = director.constructBasicGoblin("Grunt");
        System.out.println("Basic Goblin created:");
        basicGoblin.displayInfo();
        System.out.println();

        // 3. Abstract Factory + Builder
        System.out.println("3. ABSTRACT FACTORY + BUILDER");
        System.out.println("-------------------------------");

        BasicEnemyBuilder dragonBuilder = new BasicEnemyBuilder();
        director.setBuilder(dragonBuilder);
        Enemy fireDragon = director.constructFireDragon("Ignis", fireFactory);
        System.out.println("Fire Dragon created:");
        fireDragon.displayInfo();
        System.out.println();

        // 4. Prototype
        System.out.println("4. PROTOTYPE");
        System.out.println("--------------");

        EnemyRegistry registry = new EnemyRegistry();
        registry.registerTemplate("GOBLIN", basicGoblin);
        registry.registerTemplate("DRAGON", fireDragon);

        Enemy goblinClone = registry.createClone("GOBLIN");
        goblinClone.setName("Grunt Clone");
        System.out.println("Goblin clone: " + goblinClone.getName());

        Enemy dragonClone = registry.createClone("DRAGON");
        dragonClone.setName("Ignis Clone");
        System.out.println("Dragon clone: " + dragonClone.getName());
        System.out.println();

        // 5. Shadow Army
        System.out.println("5. SHADOW ARMY");
        System.out.println("---------------");

        BasicEnemyBuilder shadowBuilder = new BasicEnemyBuilder();
        shadowBuilder.setFactory(shadowFactory)
                .setName("Shadow Stalker")
                .setHealth(800)
                .setDamage(120);
        Enemy shadowTemplate = shadowBuilder.build();

        registry.registerTemplate("SHADOW", shadowTemplate);

        for (int i = 1; i <= 3; i++) {
            Enemy shadowClone = registry.createClone("SHADOW");
            shadowClone.setName("Shadow Stalker " + i);
            System.out.println("Created: " + shadowClone.getName());
        }
        System.out.println();

        System.out.println("=================================");
        System.out.println("DEMO COMPLETED SUCCESSFULLY!");
        System.out.println("=================================");
    }
}