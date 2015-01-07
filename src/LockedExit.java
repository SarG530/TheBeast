/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 */
public class LockedExit {
    private boolean northLock;
    private boolean eastLock;
    private boolean southLock;
    private boolean westLock;
    
    /**
     * Constructor for objects of class LockedExit
     */
    public LockedExit()
    {
        northLock = false;
        eastLock = false;
        southLock = false;
        westLock = false;
    }

    /**
     * Method to know if an exit is locked or not 
     */
    public boolean getNorthLock ()
    {
        return northLock;
    }
    
    /**
     * Method to know if an exit is locked or not 
     */
    public boolean getEastLock ()
    {
        return eastLock;
    }
    
    /**
     * Method to know if an exit is locked or not 
     */
    public boolean getSouthLock ()
    {
        return southLock;
    }
    
    /**
     * Method to know if an exit is locked or not 
     */
    public boolean getWestLock ()
    {
        return westLock;
    }
    
    /**
     * Method to choose if an exit is locked or not
     */
    public void setNorthLock (boolean l)
    {
        northLock = l;
    }
    
    /**
     * Method to choose if an exit is locked or not
     */
    public void setEastLock (boolean l)
    {
        eastLock = l;
    }
    
    /**
     * Method to choose if an exit is locked or not
     */
    public void setSouthLock (boolean l)
    {
        southLock = l;
    }
    
    /**
     * Method to choose if an exit is locked or not
     */
    public void setWestLock (boolean l)
    {
        westLock = l;
    }   
}
