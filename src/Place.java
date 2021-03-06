/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 */
public class Place {
    private String description;
    private Place eastExit;
    private Place northExit;
    private Place southExit;
    private Place westExit;
    private LockedExit placeExits;
    private Inventory placeInventory;
    private Character placeCharacter;

    /**
     * Constructor for objects of class Place
     */
    public Place(String desc)
    {
        description = desc;
        placeExits = new LockedExit ();
        placeInventory = new Inventory();
    }

    public Inventory getInventory(){
        return placeInventory;
    }
    /**
     * Method to have a place description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Method to give exits to the place
     */
    public void setExits (Place north, Place east, Place south, Place west)
    {
        northExit = north;
        eastExit = east;
        southExit = south;
        westExit = west;
    }

    public void setPlaceInventory (Inventory i)
    {
        placeInventory = i;
    }
    
    public Inventory getPlaceInventory ()
    {
        return placeInventory;
    }
        
    public void setPlaceCharacter (Character c)
        {
            placeCharacter = c;
        }
    
    public Character getPlaceCharacter()
    {
        return placeCharacter;
    }
   
    /**
     * Method to see the state of all the exits of a place
     */
    public LockedExit getAllExitState ()
    {
        return this.placeExits;
    }

    /**
     * Method to see the state of all the exits of a place
     */ 
    public void getExitState ()
    {
        if (placeExits.getNorthLock()== true)
            System.out.println (" North exit is locked");
        if (placeExits.getEastLock()== true)
            System.out.println (" East exit is locked");
        if (placeExits.getSouthLock()== true)
            System.out.println (" South exit is locked");
        if (placeExits.getWestLock()== true)
            System.out.println (" West exit is locked");
    }
 
    /**
     * Method to see the exit
     */
    public Place getNorthExit()
    {
        return this.northExit;      
    }

    /**
     * Method to see the exit
     */
    public Place getEastExit()
    {
        return this.eastExit;      
    }

    /**
     * Method to see the exit
     */
    public Place getSouthExit()
    {
        return this.southExit;      
    }

    /**
     * Method to see the exit
     */
    public Place getWestExit()
    {
        return this.westExit;      
    }
    
   
    public String toString (){
        return description;
    }

}
    
