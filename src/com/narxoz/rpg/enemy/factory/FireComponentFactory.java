package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.FireBreath;
import com.narxoz.rpg.combat.MeteorStrike;
import com.narxoz.rpg.loot.FireLootTable;
import com.narxoz.rpg.loot.LootTable;
import java.util.List;
import java.util.ArrayList;

public class FireComponentFactory implements EnemyComponentFactory {

    @Override
    public List<Ability> createAbilities() {
        List<Ability> abilities = new ArrayList<>();
        abilities.add(new FireBreath());
        abilities.add(new MeteorStrike());
        return abilities;
    }

    @Override
    public LootTable createLootTable() {
        return new FireLootTable();
    }

    @Override
    public String getAiBehavior() {
        return "AGGRESSIVE";
    }

    @Override
    public String getElement() {
        return "FIRE";
    }
}