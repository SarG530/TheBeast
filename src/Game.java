/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 */
public class Game {
private PlacesMap m;
private Inventory joInventory;
    
    /**
     * Starts the game
     */
    public static void main(String[] args) {
        Game myGame = new Game();
        PlacesMap m = new PlacesMap();
        m.createMap();
        Inventory joInventory = new Inventory();
        
    }  
    public Inventory getJoInventory(){
        return joInventory;
    }
}
