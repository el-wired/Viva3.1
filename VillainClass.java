package com.mycompany.hero;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elnei
 */
public class VillainClass {
    private String name;
    private String element;
     private double maxHp;
    private double hp;
    private double attack;
    private double defense;
    private int initialCD;
    private int currentCD;

public VillainClass(String name, String element, double maxHp, double attack, double defense, int initialCd) 
{
        this.name = name;
        this.element = element;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.attack = attack;
        this.defense = defense;
        this.initialCD = initialCD;
        this.currentCD = initialCD;
    }
public void getDamaged(double damage) {
            if (hp < 0) hp = 0;
            hp -= damage;
}
  public void resetHp() {
        hp = maxHp;
    }
 public void decreaseCD() {
        if (currentCD > 0) currentCD--;
    }
 public void resetCD() {
        currentCD = initialCD;
 }
 public String getName() {
        return name;
    }
 public String getElement() {
        return element;
    }
 public double getHp() {
        return hp;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }
public int getCurrentCD() {
        return currentCD;
    }
 @Override
    public String toString() {
        return "Name: " + name + "\nElement: " + element + "\nHP: " + hp + "\nAttack: " + attack +
                "\nDefense: " + defense + "\nCurrent CD: " + currentCD + "\n";
    }
}