    import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 */
public class HashMapItem {

   public static void main(String args[]) {
   
      // Create a hash map
      HashMap hmi = new HashMap();
      // Put elements to the map
      hmi.put("1", new Item ("bike"));
      hmi.put("2", new Item("meat"));
      hmi.put("3", new Item("matches"));
      hmi.put("4", new Item("ax"));
      hmi.put("5", new Item("tyre"));
      hmi.put("6", new Item("bread"));
      hmi.put("7", new Item("flour"));
      hmi.put("8", new Item("trap"));
      hmi.put("9", new Item("poison"));
      hmi.put("10", new Item("blood"));
      hmi.put("11", new Item("torch"));
      hmi.put("12", new Item("tracks"));
      
      // Get a set of the entries
      Set set = hmi.entrySet();
      // Get an iterator
      Iterator i = set.iterator();
      // Iterate over all items, using the keySet method.
        while( i.hasNext())
        {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
        }
   }
}
    
