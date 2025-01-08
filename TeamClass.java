package com.mycompany.hero;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elnei
 */
import java.util.ArrayList;
import java.util.List;

public class TeamClass {
    private List<Hero> heroList;
    private double hp;

    public TeamClass() {
        this.heroList = new ArrayList<>();
        this.hp = 0;
    }

    public void formTeam(List<Hero> deck) {
        heroList.clear();
        hp = 0;

        for (int i = 0; i < 4 && i < deck.size(); i++) {
            Hero hero = deck.get(i);
            heroList.add(hero);
            hp += hero.getHp();
        }
    }

    public void getDamaged(double damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }

    public void resetTeamHp() {
        hp = 0;
        for (Hero hero : heroList) {
            hp += hero.getHp();
        }
    }

    public List<Hero> getHeroList() {
        return heroList;
    }

    public double getHp() {
        return hp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Team's HP: ").append(hp).append("\n");
        for (int i = 0; i < heroList.size(); i++) {
            sb.append("Hero ").append(i + 1).append("\n").append(heroList.get(i).toString()).append("\n");
        }
        return sb.toString();
    }
}
