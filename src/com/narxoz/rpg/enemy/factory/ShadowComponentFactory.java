package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.ShadowBolt;
import com.narxoz.rpg.combat.Nightmare;
import com.narxoz.rpg.loot.ShadowLootTable;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;
import java.util.ArrayList;

public class ShadowComponentFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new ShadowBolt());
        abilities.add(new Nightmare());
        return abilities;
    }

    @Override
    public LootTable createLootTable() {
        return new ShadowLootTable();
    }

    @Override
    public String getAiBehavior() {
        return "STEALTHY";
    }

    @Override
    public String getElement() {
        return "SHADOW";
    }
}