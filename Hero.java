/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hero;

/**
 *
 * @author elnei
 */
public class Hero {
    private String name;
    private String element; 
    private double hp;
    private double attack;

    // Constructor
    public Hero(String name, String element, double hp, double attack) {
        this.name = name;
        this.element = element;
        this.hp = hp;
        this.attack = attack;
    }

   
    public double calculateDamage(VillainClass enemy, int runesMultiplier) {
        double dominanceMultiplier = getDominanceMultiplier(this.element, enemy.getElement());
        double damage = (this.attack * dominanceMultiplier * runesMultiplier) - enemy.getDefense();
        //Damage = Attack * Dominance multiplier * Runestone multiplier - Defense 
        return Math.max(damage, 1);
    }

    private double getDominanceMultiplier(String heroElement, String villainElement) {
      
        if (heroElement.equals("Water") && villainElement.equals("Earth")) return 0.5;
        if (heroElement.equals("Fire") && villainElement.equals("Water")) return 0.5;
        if (heroElement.equals("Earth") && villainElement.equals("Fire")) return 0.5;
        if (heroElement.equals("Light") && villainElement.equals("Light")) return 0.5;
        if (heroElement.equals("Dark") && villainElement.equals("Dark")) return 0.5;
        if (heroElement.equals("Water") && villainElement.equals("Fire")) return 1.5;
        if (heroElement.equals("Fire") && villainElement.equals("Earth")) return 1.5;
        if (heroElement.equals("Earth") && villainElement.equals("Water")) return 1.5;
        if (heroElement.equals("Light") && villainElement.equals("Dark")) return 1.5;
        if (heroElement.equals("Dark") && villainElement.equals("Light")) return 1.5;
        //FOLLOWING THE IMAGE PROVIDED
        return 1.0; 
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
    public void setHp(double hp) {
        this.hp = hp;
    }
    public double getAttack() {
        return attack;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nElement: " + element + "\nHP: " + hp + "\nAttack: " + attack + "\n";
    }
}
