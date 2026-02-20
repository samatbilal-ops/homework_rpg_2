package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.Goblin;
import com.narxoz.rpg.enemy.factory.EnemyComponentFactory;
import com.narxoz.rpg.combat.Ability;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GoblinBuilder implements EnemyBuilder {
    private Goblin enemy;
    private EnemyComponentFactory factory;

    public GoblinBuilder() {
        this.enemy = new Goblin();
        setDefaultValues();
    }

    private void setDefaultValues() {
        enemy.setHealth(100);
        enemy.setDamage(15);
        enemy.setDefense(5);
        enemy.setSpeed(20);
        enemy.setElement("PHYSICAL");
        enemy.setAiBehavior("COWARD");
    }

    @Override
    public EnemyBuilder reset() {
        this.enemy = new Goblin();
        setDefaultValues();
        return this;
    }

    @Override
    public EnemyBuilder setName(String name) {
        enemy.setName(name);
        return this;
    }

    @Override
    public EnemyBuilder setHealth(int health) {
        enemy.setHealth(health);
        return this;
    }

    @Override
    public EnemyBuilder setDamage(int damage) {
        enemy.setDamage(damage);
        return this;
    }

    @Override
    public EnemyBuilder setDefense(int defense) {
        enemy.setDefense(defense);
        return this;
    }

    @Override
    public EnemyBuilder setSpeed(int speed) {
        enemy.setSpeed(speed);
        return this;
    }

    @Override
    public EnemyBuilder setElement(String element) {
        enemy.setElement(element);
        return this;
    }

    @Override
    public EnemyBuilder setAbilities(List<String> abilities) {
        enemy.setAbilities(abilities);
        return this;
    }

    @Override
    public EnemyBuilder setLootTable(Map<String, Integer> lootTable) {
        enemy.setLootTable(lootTable);
        return this;
    }

    @Override
    public EnemyBuilder setAiBehavior(String aiBehavior) {
        enemy.setAiBehavior(aiBehavior);
        return this;
    }

    @Override
    public EnemyBuilder setFactory(EnemyComponentFactory factory) {
        this.factory = factory;
        if (factory != null) {
            List<Ability> abilityObjects = factory.createAbilities();
            List<String> abilityNames = abilityObjects.stream()
                    .map(Ability::getName)
                    .collect(Collectors.toList());
            setAbilities(abilityNames);
            setLootTable(factory.createLootTable().getLoot());
            setAiBehavior(factory.getAiBehavior());
            setElement(factory.getElement());
        }
        return this;
    }

    public GoblinBuilder makeElite() {
        enemy.setHealth(enemy.getHealth() * 2);
        enemy.setDamage(enemy.getDamage() * 2);
        enemy.setDefense(enemy.getDefense() * 2);
        enemy.setName("Elite " + enemy.getName());
        return this;
    }

    public GoblinBuilder makeChampion() {
        enemy.setHealth(enemy.getHealth() * 5);
        enemy.setDamage(enemy.getDamage() * 4);
        enemy.setDefense(enemy.getDefense() * 3);
        enemy.setSpeed(enemy.getSpeed() * 2);
        enemy.setName("Champion " + enemy.getName());
        enemy.setAiBehavior("BRAVE");
        return this;
    }

    @Override
    public Enemy build() {
        return enemy;
    }
}