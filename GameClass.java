package com.mycompany.hero;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elnei
 */
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameClass {
    public void battle(TeamClass team, VillainClass enemy) {
        
        team.resetTeamHp();
        enemy.resetHp();
        enemy.resetCD();


        List<String> elements = Arrays.asList("Water", "Fire", "Earth", "Light", "Dark");
Random random = new Random();
        int round = 1;
        while (team.getHp() > 0 && enemy.getHp() > 0) {
            System.out.println("Round " + round);
            System.out.println(enemy.getCurrentCD() + "Enemy's current CD: ");
            
            String[] runestones = new String[3];
            for (int i = 0; i < 3; i++) {
                runestones[i] = elements.get(random.nextInt(elements.size()));
            }
            System.out.println("Runestones dissolved: " + Arrays.toString(runestones));

            for (Hero hero : team.getHeroList()) {
                int rsMultiplier = (int) Arrays.stream(runestones).filter(r -> r.equals(hero.getElement())).count();
                if (rsMultiplier > 0) {
                    double damage = hero.calculateDamage(enemy, rsMultiplier);
                    enemy.getDamaged(damage);
                    System.out.println(hero.getName() + " dealt " + damage + " damage to " + enemy.getName());
                }
            }
            if (enemy.getHp() <= 0) {
                System.out.println("\nThe team won!");
                return;
            }

            if (enemy.getCurrentCD() == 1 && enemy.getHp() > 0) {
                team.getDamaged(enemy.getAttack());
                System.out.println(enemy.getName() + " dealt " + enemy.getAttack() + " damage to the team");
                enemy.resetCD();
            } else {
                enemy.decreaseCD();
            }
            if (team.getHp() <= 0) {
                System.out.println("\nThe team lost.");
                return;
            }

            System.out.println("Team's remaining HP: " + team.getHp());
            System.out.println("Enemy's remaining HP: " + enemy.getHp() + "\n");
            round++;
        }
    }
}

