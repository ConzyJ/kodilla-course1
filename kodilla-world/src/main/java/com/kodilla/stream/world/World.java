package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())  // Spłaszczamy do pojedynczej listy krajów
                .map(Country::getPeopleQuantity)  // Pobieramy liczbę ludności z każdego kraju
                .reduce(BigDecimal.ZERO, BigDecimal::add);  // Sumujemy wszystkie wartości
    }

    public List<Continent> getContinents() {
        return continents;
    }
}
