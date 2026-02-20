package com.narxoz.rpg.loot;

import java.util.Map;

public interface LootTable {
    Map<String, Integer> getLoot();
    String getTableName();
}