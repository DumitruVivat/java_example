package main.lesson3;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        List<String> planets = List.of("Mercury", "Neptune", "Venus", "Earth","Mercury", "Neptune","Mercury", "Mars", "Jupiter","Mercury", "Saturn", "Uranus", "Neptune");
//        List<String> uniquePlanets = new ArrayList<>();
//        List<Integer> counters = new ArrayList<>();
//
//        for (String planet : planets) {
//            int index = uniquePlanets.indexOf(planet);
////            System.out.println(uniquePlanets);
//            if (index == -1) {
//                uniquePlanets.add(planet);
//                counters.add(1);
//            } else {
//                counters.set(index, counters.get(index) + 1);
////                System.out.println(counters);
//            }
//        }
//
//        for(int i = 0; i < uniquePlanets.size(); i++) {
//            System.out.println(uniquePlanets.get(i) + " : " + counters.get(i));
//        }
//
//        for (String planet : planets) {
//            if(!uniquePlanets.contains(planet)) {
//                uniquePlanets.add(planet);
//            }
//        }
//
//        System.out.println("Unique planes: ");
//        for(String planet : uniquePlanets) {
//            System.out.println(planet);
//        }

        Map<String, Integer> planetCounts = new HashMap<>();

        for (String planet : planets) {
            planetCounts.put(planet, planetCounts.getOrDefault(planet, 0) + 1);
        }
        for(Map.Entry<String, Integer> entry : planetCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Set<String> uniquePlanets = new HashSet<>(planets);

        System.out.println("Unique planets: ");
        for (String planet : uniquePlanets) {
            System.out.println(planet);
        }
    }
}
