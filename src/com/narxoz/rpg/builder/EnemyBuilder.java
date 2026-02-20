package com.narxoz.rpg.builder;

import com.narxoz.rpg.enemy.Enemy;
import com.narxoz.rpg.enemy.factory.EnemyComponentFactory;
import java.util.List;
import java.util.Map;

public interface EnemyBuilder {
    EnemyBuilder reset();
    EnemyBuilder setName(String name);
    EnemyBuilder setHealth(int health);
    EnemyBuilder setDamage(int damage);
    EnemyBuilder setDefense(int defense);
    EnemyBuilder setSpeed(int speed);
    EnemyBuilder setElement(String element);
    EnemyBuilder setAbilities(List<String> abilities);
    EnemyBuilder setLootTable(Map<String, Integer> lootTable);
    EnemyBuilder setAiBehavior(String aiBehavior);
    EnemyBuilder setFactory(EnemyComponentFactory factory);
    Enemy build();
}