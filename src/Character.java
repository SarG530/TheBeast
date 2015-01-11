/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 */
public class Character {
    private String name;
    private String description;
    private Inventory CharInventory;
    
    public Character (String name, String description){
        name = this.name;
        description = this.description;
        CharInventory = new Inventory();
    }
    
    public void setName (String n){
        name = n;
    }
    
    public void getName(){
        if(name != null){
        System.out.println("Name : " + name);
        }
    }
    
    public void setDescription(String newDescription){
        description = newDescription;
    }
    
    public void getDescription (){
        System.out.println("Description : " + description);
    }
    
}
 
