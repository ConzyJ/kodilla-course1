package com.kodilla.stream;

import com.kodilla.stream.world.*;

import java.math.BigDecimal;

public class StreamMain {
    public static void main(String[] args) {
        World world = new World();

        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("83000000")));
        europe.addCountry(new Country("France", new BigDecimal("67000000")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", new BigDecimal("1440000000")));
        asia.addCountry(new Country("India", new BigDecimal("1390000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("126000000")));

        Continent americas = new Continent("Americas");
        americas.addCountry(new Country("USA", new BigDecimal("331000000")));
        americas.addCountry(new Country("Brazil", new BigDecimal("213000000")));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(americas);

        System.out.println("Total world population: " + world.getPeopleQuantity());
    }
}
