/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 */
public class Item {
    private String description;
    private Place location;
    
    public Item (String desc){
        description = desc;
        location = null;
    }
    
    public String getItemDesc(){
        return description;
    }  
    
    public void setItemDesc(String s){
        description = s;
    }
    
    public Place getLocation(){
    return location;
    }
        /**
     * 
     */
    public String toString (){
        return description;
    }
}
