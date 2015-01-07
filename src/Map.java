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
public class Map {
// instance variables - replace the example below with your own
    private ArrayList<Place> thePlaces;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        thePlaces = new ArrayList<Place>();
    }

    /**
     * Method to create a new place in the map
     */
    public void addPlace(String n)
    {
        thePlaces.add(new Place (n));  
    }

    /**
     * Show all the places
     */
    public void show()
    {
        for (Place p : thePlaces){
            System.out.println ("Place : " + p.getDescription());        
            if (p.getNorthExit()!= null){
                System.out.println ("North exit : " + p.getNorthExit());
            }
            if (p.getEastExit()!= null){
                System.out.println ("East exit : " + p.getEastExit());
            }
            if (p.getSouthExit()!= null){   
                System.out.println ("South exit :" + p.getSouthExit());
            }
            if (p.getWestExit()!= null){        
                System.out.println ("West exit : " + p.getWestExit());
            }
            //System.out.println ("State Lock : " + p.getExitState());
            p.getExitState();
        }
    }

    /**
     * Method to create the map
     */
    public void createMap ()
    {       
        Place field = new Place ("Field" );
        Place farm = new Place ("Farm");
        Place road = new Place ("Road");
        Place villageCenter = new Place ("Center");
        Place bakery = new Place ("Bakery");
        Place mill = new Place ("Mill");
        Place jackhouse = new Place ("Jack's house");
        Place woodcutteroffice = new Place ("Woodcutter's office");
        Place church = new Place ("Church");
        Place cemetery = new Place ("Cemetery");
        Place forest = new Place ("Forest");
        Place shadespath = new Place ("Shades Path");
        //Place north, Place east, Place south, Place west
        Place fearpath = new Place ("Fear Path");
        field.setExits (road, farm, null, null);
        field.getNorthExit();
        thePlaces.add(field);
        farm.setExits (null, null, null, field);
        thePlaces.add(farm);
        road.setExits (villageCenter, church, farm, field);
        thePlaces.add(road);
        villageCenter.setExits (jackhouse, woodcutteroffice, road, bakery);
        thePlaces.add(villageCenter);
        bakery.setExits (null, villageCenter, null, mill);
        thePlaces.add(bakery);
        mill.setExits (null, bakery, null, null);
        thePlaces.add(mill);
        jackhouse.setExits (null, null, villageCenter, null);
        thePlaces.add(jackhouse);
        woodcutteroffice.setExits (null, null, null, villageCenter);
        thePlaces.add(woodcutteroffice);
        church.setExits (null, cemetery, null, road);
        thePlaces.add(church);
        cemetery.setExits (null, null, forest, church);
        thePlaces.add(cemetery);
        forest.setExits (cemetery, fearpath, null, shadespath);
        forest.getAllExitState().setEastLock (true); // East exit (fearpath) is locked
        forest.getAllExitState().setWestLock (true); // West exit (shadespath) is locked
        thePlaces.add(forest);
        shadespath.setExits (null, forest, null, null);
        thePlaces.add(shadespath);
        fearpath.setExits (null, null, null, forest);
        thePlaces.add(fearpath);
        show();
    }   
}
