package com.narxoz.rpg.loot;

import java.util.HashMap;
import java.util.Map;

public class ShadowLootTable implements LootTable {
    private Map<String, Integer> loot;
    private String tableName = "Shadow Loot Table";

    public ShadowLootTable() {
        this.loot = new HashMap<>();
        loot.put("Shadow Essence", 35);
        loot.put("Void Crystal", 25);
        loot.put("Darksteel", 30);
        loot.put("Umbral Core", 15);
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