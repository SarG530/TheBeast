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
public class HashMapPlace {

   public static void main(String args[]) {
   
      // Create a hash map
      HashMap hmp = new HashMap();
      // Put elements to the map
      hmp.put("1", new Item ("Field"));
      hmp.put("2", new Item("Farm"));
      hmp.put("3", new Item ("Road"));
      hmp.put("4", new Item("Center"));
      hmp.put("5", new Item ("Bakery"));
      hmp.put("6", new Item("Mill"));
      hmp.put("7", new Item ("Jack's house"));
      hmp.put("8", new Item("Woodcutter's office"));
      hmp.put("9", new Item ("Church"));
      hmp.put("10", new Item("Cemetery"));
      hmp.put("11", new Item("Forest"));
      hmp.put("12", new Item("Shades Path"));
      hmp.put("13", new Item("Fear Path"));
      
      // Get a set of the entries
      Set set = hmp.entrySet();
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