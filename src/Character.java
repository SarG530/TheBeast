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
    
    public Character (String name, String description){
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
 
