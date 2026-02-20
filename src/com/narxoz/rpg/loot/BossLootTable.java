package com.narxoz.rpg.loot;

import java.util.HashMap;
import java.util.Map;

public class BossLootTable implements LootTable {
    private Map<String, Integer> loot;
    private String tableName = "Boss Loot Table";

    public BossLootTable() {
        this.loot = new HashMap<>();
        initializeLoot();
    }

    private void initializeLoot() {
        loot.put("Legendary Sword", 15);
        loot.put("Dragon Heart", 10);
        loot.put("Ancient Relic", 20);
        loot.put("Epic Armor Set", 8);
        loot.put("Mythic Gem", 5);
        loot.put("Gold Coins", 100);
        loot.put("Experience Scroll", 40);
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