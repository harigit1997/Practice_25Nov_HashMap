package Practice_25Nov;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//Write a Java program to associate the specified value with the specified key in a HashMap.
public class HashMap_Pro {
    public static void main(String[] args) {
        Map<Integer ,String> Days = new HashMap<>();
        Days.put(1,"Sunday");
        Days.put(2,"Monday");
        Days.put(3,"Tuesday");
        Days.put(4,"Wednesday");
        Days.put(5,"Thursday");
        Days.put(6,"Friday");
        Days.put(7,"Saturday");
        System.out.println("Map is: ");
        System.out.println(Days);

        //Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("the number of key-value (size) mappings in a map is :"+ Days.size());

        //Write a Java program to copy all mappings from the specified map to another map.
        HashMap<Integer,String> Work_Days = new HashMap<>();
        Work_Days.putAll(Days);
        System.out.println(Work_Days);

        //Write a Java program to remove all mappings from a map.
//        Work_Days.clear();
        System.out.println(Work_Days);

        //Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println(Work_Days.isEmpty());

        //Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<Integer,String> sha = new HashMap<>(Work_Days);
        System.out.println(sha);

        //Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println(Work_Days.containsKey(8));

        //Write a Java program to test if a map contains a mapping for the specified value.
        System.out.println(Work_Days.containsValue("Sunday"));

        //Write a Java program to create a set view of the mappings contained in a map.
        System.out.println(Work_Days.entrySet());

        //Write a Java program to get the value of a specified key in a map.
        System.out.println(Work_Days.get(6));

        //11. Write a Java program to get a set view of the keys contained in this map.
        System.out.println(Work_Days.keySet());

        //12. Write a Java program to get a collection view of the values contained in this map.
        Collection<String> values = Work_Days.values();
        System.out.println(values);

        //Create a HashMap to store the mappings of country names to their capitals.
        Map<String,String> cc = new HashMap<>();
        cc.put("Afghanistan", "Kabul");
        cc.put("India","Delhi");
        cc.put("Nepal","Kathmandu");
        cc.put("Bangladesh","Dhaka");
        cc.put("China","Beijing");
        System.out.println(cc);

        //Create a HashMap to store the mappings of employee IDs to their names.
        Map<Integer,String> IN = new HashMap<>();
        IN.put(101, "Kapil");
        IN.put(102,"David");
        IN.put(103,"Kalpesh");
        IN.put(107,"Sanjay");
        IN.put(108,"Jay");
        System.out.println(IN);

        //Create a HashMap to store the mappings of city names to their populations.
        Map<String, Integer> population = new HashMap<>();
        population.put("Delhi",100000000);
        population.put("Mumbai",400000000);
        population.put("Bengaluru",350000000);
        population.put("Pune",450000000);
        population.put("Hydrabad",340000000);
        System.out.println(population);

        //Create a HashMap to store the mappings of product names to their prices.
        Map<String, Integer> stock = new HashMap<>();
        stock.put("Amul Icecream",50);
        stock.put("Bottle",20);
        stock.put("Milk",28);
        stock.put("Fan",240);

        //Create a HashMap to store the mappings of employee IDs to their departments.
        Map<Integer,String> department = new HashMap<>();
        department.put(101,"Sales");
        department.put(102,"IT");
        department.put(103,"IT");
        department.put(104,"R&D");


    }
}
