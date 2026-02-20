package com.narxoz.rpg.loot;

import java.util.HashMap;
import java.util.Map;

public class BasicLootTable implements LootTable {
    private Map<String, Integer> loot;
    private String tableName = "Basic Loot Table";

    public BasicLootTable() {
        this.loot = new HashMap<>();
        initializeLoot();
    }

    private void initializeLoot() {
        loot.put("Gold Coins", 60);
        loot.put("Health Potion", 40);
        loot.put("Rusty Sword", 30);
        loot.put("Leather Armor", 20);
        loot.put("Magic Scroll", 10);
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
