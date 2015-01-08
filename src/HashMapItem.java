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
      
      // Get a set of the entries
      Set set = hmi.entrySet();
      // Get an iterator
      Iterator i = set.iterator();
      // Iterate over all vehicles, using the keySet method.
        while( i.hasNext())
        {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
        }
   }
}
    
