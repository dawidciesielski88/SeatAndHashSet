package com.dawidciesielski;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    private static Set<HeavenlyBody> satellites = new HashSet<>();

    public static void main(String[] args) {

        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getNAME(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getNAME(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getNAME(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Mars", 385);
        solarSystem.put(temp.getNAME(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Mars", 385);
        solarSystem.put(temp.getNAME(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getNAME(),tempMoon);
        satellites.add(tempMoon);

        tempMoon = new HeavenlyBody("Deimos", 90);
        solarSystem.put(tempMoon.getNAME(),tempMoon);
        satellites.add(tempMoon);

        tempMoon = new HeavenlyBody("Phobos", 87);
        solarSystem.put(tempMoon.getNAME(),tempMoon);
        satellites.add(tempMoon);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getNAME());
        }


        System.out.println("All moons: ");
        for (HeavenlyBody moon : satellites) {
            System.out.println("\t" + moon.getNAME());
        }
    }
}
