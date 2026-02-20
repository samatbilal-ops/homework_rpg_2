package com.narxoz.rpg.loot;

import java.util.HashMap;
import java.util.Map;

public class IceLootTable implements LootTable {
    private Map<String, Integer> loot;
    private String tableName = "Ice Loot Table";

    public IceLootTable() {
        this.loot = new HashMap<>();
        loot.put("Frozen Shard", 40);
        loot.put("Permafrost Crystal", 30);
        loot.put("Ice Dragon Scale", 25);
        loot.put("Glacial Core", 15);
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