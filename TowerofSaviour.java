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
public class TowerofSaviour {
    public static void main(String[] args) {
        Hero molly = new Hero("Molly", "Water", 45, 20);
        Hero sean = new Hero("Sean", "Fire", 36, 24);
        Hero duncan = new Hero("Duncan", "Earth", 53, 16);
        Hero nathaniel = new Hero("Nathaniel", "Light", 37, 24);
        Hero endor = new Hero("Endor", "Dark", 43, 21);
         Hero urd = new Hero("Urd", "Water", 65, 17);  
        Hero skuld = new Hero("Skuld", "Fire", 66, 16);  
        Hero verthandi = new Hero("Verthandi", "Earth", 74, 13);  
        Hero idun = new Hero("Idun", "Light", 59, 19);  
        Hero valkyrie = new Hero("Valkyrie", "Dark", 61, 18);  
        Hero poseidon = new Hero("Poseidon", "Water", 58, 19);  
        Hero hephaestus = new Hero("Hephaestus", "Fire", 51, 22);  
        Hero athena = new Hero("Athena", "Earth", 61, 18);  
        Hero apollo = new Hero("Apollo", "Light", 55, 16);  
        Hero artemis = new Hero("Artemis", "Dark", 50, 23);  
          
        Hero[] heroes = {molly, sean, duncan, nathaniel, endor, urd, skuld, 
verthandi, idun, valkyrie, poseidon, hephaestus, athena, apollo, artemis};  
          
        VillainClass giemsa = new VillainClass("Giemsa", "Water", 100, 150, 15, 2);  
        VillainClass diablo = new VillainClass("Diablo", "Fire", 120, 163, 13, 3);  
        VillainClass nidhogg = new VillainClass("Nidhogg", "Earth", 130, 189, 11, 4);  
        VillainClass lucifer = new VillainClass("Lucifer", "Light", 110, 207, 17, 3);  
        VillainClass odin = new VillainClass("Odin", "Dark", 135, 196, 14, 5); 
        
        List<Hero> deck = new ArrayList<>();
        deck.add(molly);
        deck.add(sean);
        deck.add(duncan);
        deck.add(nathaniel);
        deck.add(urd);
        deck.add(skuld);
        deck.add(verthandi);
        deck.add(idun);
        deck.add(valkyrie);
        deck.add(poseidon);
        deck.add(hephaestus);
        deck.add(athena);
        deck.add(apollo);
        deck.add(artemis);
    
        
        TeamClass team = new TeamClass();
        team.formTeam(deck);
        GameClass game = new GameClass();
        game.battle(team, giemsa);
    }
}

