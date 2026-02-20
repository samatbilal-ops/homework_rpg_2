package com.narxoz.rpg.loot;

import java.util.HashMap;
import java.util.Map;

public class FireLootTable implements LootTable {
    private Map<String, Integer> loot;
    private String tableName = "Fire Loot Table";

    public FireLootTable() {
        this.loot = new HashMap<>();
        initializeLoot();
    }

    private void initializeLoot() {
        loot.put("Fire Dragon Scale", 40);
        loot.put("Emberstone", 30);
        loot.put("Phoenix Feather", 20);
        loot.put("Inferno Core", 10);
        loot.put("Flame Essence", 25);
        loot.put("Burning Heart", 5);
    }

    @Override
    public Map<String, Integer> getLoot() {
        return loot;
    }

    @Override
    public String getTableName() {
        return tableName;
    }


    }
