import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 */
public class Inventory {
    private ArrayList<Item> theItems;
    
    /**
     * Constructor for objects of class Inventory
     */
    public Inventory()
    {
        theItems=new ArrayList<Item>();
    }
    /**
     * Method to add a new item in the inventory
     */
   /* public void addItem (String i)
    {
        theItems.add(new Item(i));
    }
    */
    public void addItem (Item i)
    {
        theItems.add(i);
    }
    
    /**
     * Method to remove an item in the inventory
     */
    public void removeItem (Item i)
    {
        theItems.remove(i);
    }
    
    /**
     * Method to search an item n Inventory and return if it find or not 
     */
    public boolean searchItem (String NomItem)
    {
        boolean res = false;
        for (Item i : theItems){
            if (i.getItemDesc() == NomItem){
                res = true;
            }
        }
        return res;
    }
     
    /**
     * Show all the items
     */
    public void show()
    {
        for (Item i : theItems){
            if (i != null){
            System.out.println ("Item : " + i.getItemDesc()); 
            }
        }
    }
    
    public String getInvItem()
    {
        for (Item i : theItems)
            if (i!= null){
            return i.getItemDesc();
            }
        return null;
    }
    
    /**
     * Method to create the inventory
     */
    public void setInventory (Item i1, Item i2)
    {
        theItems.add(i1); 
        theItems.add(i2);
    }
}
