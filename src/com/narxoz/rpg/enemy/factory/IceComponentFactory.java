package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.IceShard;
import com.narxoz.rpg.combat.FrostNova;
import com.narxoz.rpg.loot.IceLootTable;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;
import java.util.ArrayList;

public class IceComponentFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new IceShard());
        abilities.add(new FrostNova());
        return abilities;
    }

    @Override
    public LootTable createLootTable() {
        return new IceLootTable();
    }

    @Override
    public String getAiBehavior() {
        return "DEFENSIVE";
    }

    @Override
    public String getElement() {
        return "ICE";
    }
}