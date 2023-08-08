/**
 * Name: MyHashMap.java
 * Written by: Adam Frisch
 * Written on: 1/22/23
 * Purpose: Java HashMap example.
 * Hashmaps are similar to Python dictionaries with key value pairs
 */
import java.util.HashMap;

class HashMapFun {
    public static void main(String[] args) {
        // Create a HashMap with String key and String value
        HashMap<String, String> myHashMap = new HashMap<String, String>();

        // Use .put() method to add keys and values to the hashmap
        myHashMap.put("21", "Kiwi");
        myHashMap.put("01", "Apple");
        myHashMap.put("10", "Banana");
        myHashMap.put("12", "Pear");

        // Print all alements of the HashMap
        // HashMap key value pairs are not indexed, and they are not ordered
        System.out.println("myHashMap: " + myHashMap);

        // Use .get() method to get values at a key location
        System.out.println("\nValue at key = 01: " + myHashMap.get("01"));
        System.out.println("Value at key = 10: " + myHashMap.get("10"));
        System.out.println("Value at key = 11: " + myHashMap.get("11"));

        // Is the HashMap empty: use .isEmpty() method
        System.out.println("\nIs my dictionary empty? " +
            myHashMap.isEmpty() + "\n");
        
        // Use .remove() method to remove value at key 10
        myHashMap.remove("10");
        System.out.println("Checking if the removed value exists: " +
            myHashMap.get("10"));
        System.out.println("\nSize of myHashMap: " + myHashMap.size());

        // Print all keys with for each loop
        for (String key : myHashMap.keySet()) {
            System.out.println(key);
        }

        // Print all values with for each loop
        for (String values : myHashMap.values()) {
            System.out.println(values);
        }

        // Print keys and values with for each loop
        for (String key : myHashMap.keySet()) {
            System.out.println("Key: " +
                key + " Value: " + myHashMap.get(key));
        }
    }
}
