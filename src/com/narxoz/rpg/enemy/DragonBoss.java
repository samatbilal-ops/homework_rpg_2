package com.narxoz.rpg.enemy;

import java.util.*;

public class DragonBoss implements Enemy {
    private String name;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private String element;
    private List<String> abilities;
    private Map<String, Integer> lootTable;
    private String aiBehavior;
    private int currentHealth;
    private int currentPhase;

    public DragonBoss() {
        this.abilities = new ArrayList<>();
        this.lootTable = new HashMap<>();
        this.currentPhase = 1;
    }

    @Override
    public String getName() { return name; }
    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public int getHealth() { return health; }
    @Override
    public void setHealth(int health) {
        this.health = health;
        this.currentHealth = health;
    }

    @Override
    public int getDamage() { return damage; }
    @Override
    public void setDamage(int damage) { this.damage = damage; }

    @Override
    public int getDefense() { return defense; }
    @Override
    public void setDefense(int defense) { this.defense = defense; }

    @Override
    public int getSpeed() { return speed; }
    @Override
    public void setSpeed(int speed) { this.speed = speed; }

    @Override
    public String getElement() { return element; }
    @Override
    public void setElement(String element) { this.element = element; }

    @Override
    public List<String> getAbilities() { return abilities; }
    @Override
    public void setAbilities(List<String> abilities) { this.abilities = abilities; }

    @Override
    public Map<String, Integer> getLootTable() { return lootTable; }
    @Override
    public void setLootTable(Map<String, Integer> lootTable) { this.lootTable = lootTable; }

    @Override
    public String getAiBehavior() { return aiBehavior; }
    @Override
    public void setAiBehavior(String aiBehavior) { this.aiBehavior = aiBehavior; }

    @Override
    public Enemy clone() {
        DragonBoss clone = new DragonBoss();
        clone.name = this.name;
        clone.health = this.health;
        clone.damage = this.damage;
        clone.defense = this.defense;
        clone.speed = this.speed;
        clone.element = this.element;
        clone.abilities = new ArrayList<>(this.abilities);
        clone.lootTable = new HashMap<>(this.lootTable);
        clone.aiBehavior = this.aiBehavior;
        clone.currentHealth = this.currentHealth;
        clone.currentPhase = this.currentPhase;
        return clone;
    }

    @Override
    public void takeDamage(int damage) {
        int reducedDamage = Math.max(1, damage - defense);
        currentHealth -= reducedDamage;

        if (currentHealth < health * 0.3 && currentPhase < 3) {
            currentPhase = 3;
            System.out.println(name + " PHASE 3! ENRAGED!");
        } else if (currentHealth < health * 0.6 && currentPhase < 2) {
            currentPhase = 2;
            System.out.println(name + " PHASE 2! STRONGER!");
        }

        System.out.println(name + " получил " + reducedDamage + " урона! Фаза: " + currentPhase);
    }

    @Override
    public boolean isAlive() {
        return currentHealth > 0;
    }

    @Override
    public void attack(Enemy target) {
        int phaseBonus = currentPhase * 50;
        System.out.println(name + " атакует " + target.getName() + "! (Фаза " + currentPhase + ")");
        target.takeDamage(damage + phaseBonus);
    }

    @Override
    public void displayInfo() {
        System.out.println("=== BOSS: " + name + " ===");
        System.out.println("Health: " + currentHealth + "/" + health);
        System.out.println("Damage: " + damage);
        System.out.println("Defense: " + defense);
        System.out.println("Speed: " + speed);
        System.out.println("Element: " + element);
        System.out.println("Phase: " + currentPhase);
        System.out.println("AI: " + aiBehavior);
    }
}