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
public class PlacesMap {
// instance variables - replace the example below with your own
    private ArrayList<Place> thePlaces;

    /**
     * Constructor for objects of class Map
     */
    public PlacesMap()
    {
        thePlaces = new ArrayList<Place>();
    }

    /**
     * Method to add a new place in the map
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
            p.getPlaceInventory().show();
            if (p.getPlaceCharacter()!= null){
            p.getPlaceCharacter().getName();
            }
          
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
        Character fieldCharacter = new Character("Jo", "Jo (you in the game) is a farmer in Silent Hill. He has 28 years old. He raises sheep (about 40) for  milk, wool and carne. He has got severals field to can to feed his flock all the year. His work closes is composed to a blue overall, a check shirt and boots. Jo is a brave man, he doesn't hesitate to take actions to help the village and villagers.");
        field.setPlaceCharacter(fieldCharacter);
        //Character jo = new Character ("Jo");
        field.getPlaceCharacter().setName("Jo");
        thePlaces.add(field);
        
        farm.setExits (null, null, null, field);
        Inventory farmInventory= new Inventory();
        farm.setPlaceInventory(farmInventory);
        Item bike = new Item("bike");
        Item meat = new Item("meat");
        farm.getPlaceInventory().setInventory(bike, meat);
        thePlaces.add(farm);
        
        road.setExits (villageCenter, church, farm, field);
        thePlaces.add(road);
        
        villageCenter.setExits (jackhouse, woodcutteroffice, road, bakery);
        thePlaces.add(villageCenter);
        
        bakery.setExits (null, villageCenter, null, mill);
        Inventory bakeryInventory= new Inventory();
        bakery.setPlaceInventory(bakeryInventory);
        Item bread = new Item("bread");
        bakery.getPlaceInventory().setInventory(bread, null);
        Character bakeryCharacter = new Character("The Baker", "The baker is a important person in the village. Indeed, all inhabitants come everydays into his bakery to buy bread. He profites to discuss with everyone and peoples like it. He is very friendly and hard worker. He has about 35 years old.");
        bakery.setPlaceCharacter(bakeryCharacter);
        bakery.getPlaceCharacter().setName("The Baker");
        thePlaces.add(bakery);
        
        mill.setExits (null, bakery, null, null);
        Inventory millInventory= new Inventory();
        mill.setPlaceInventory(millInventory);
        Item flour = new Item("flour");
        Item trap = new Item("trap");
        mill.getPlaceInventory().setInventory(flour, trap);
        thePlaces.add(mill);
        
        jackhouse.setExits (null, null, villageCenter, null);
        Inventory jackhouseInventory= new Inventory();
        jackhouse.setPlaceInventory(jackhouseInventory);
        Item matches = new Item("matches");
        jackhouse.getPlaceInventory().setInventory(matches, null);
        Character jackhouseCharacter = new Character("Jack","Jack is the best friend to Jo. He is alos a farmer. Jo met Jack at shcool. He is less brave than Jo and rather timid.");
        jackhouse.setPlaceCharacter(jackhouseCharacter);
        jackhouse.getPlaceCharacter().setName("Jack");
        thePlaces.add(jackhouse);
        
        woodcutteroffice.setExits (null, null, null, villageCenter);
        Inventory woodcutterofficeInventory= new Inventory();
        woodcutteroffice.setPlaceInventory(woodcutterofficeInventory);
        Item ax = new Item("ax");
        Item tyre = new Item("tyre");
        woodcutteroffice.getPlaceInventory().setInventory(ax, tyre);
        Character woodcutterofficeCharacter = new Character("The Woodcutter", "The woodcutter have about 50 years old. He usually lonely and talkative, but he's not bad. He likes nothing missing to can work and he is an outstanding mechanics (and woocutter of course).");
        woodcutteroffice.setPlaceCharacter(woodcutterofficeCharacter);
        woodcutteroffice.getPlaceCharacter().setName("The Woodcutter");
        thePlaces.add(woodcutteroffice);
        
        church.setExits (null, cemetery, null, road);
        Inventory churchInventory= new Inventory();
        church.setPlaceInventory(churchInventory);
        Item blood = new Item("blood");
        Item poison = new Item("poison");
        church.getPlaceInventory().setInventory(blood, poison);
        Character churchCharacter = new Character("The Priest", "Father Flood is a man who live only for God and the Church. He has about 60 years old and wears most of time his Priest's clothes. He leave into the church.");
        church.setPlaceCharacter(churchCharacter);
        church.getPlaceCharacter().setName("The Priest");
        thePlaces.add(church);
        
        cemetery.setExits (null, null, forest, church);
        Inventory cemeteryInventory= new Inventory();
        cemetery.setPlaceInventory(cemeteryInventory);
        Item tracks = new Item("tracks");
        Item torch = new Item("torch");
        cemetery.getPlaceInventory().setInventory(tracks, torch);
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
