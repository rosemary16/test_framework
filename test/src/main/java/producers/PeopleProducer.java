package producers;

import models.People;

public class PeopleProducer {

    public static long peopleId = 1L;

    private static String[] films = {
            "https://swapi.co/api/films/2/",
            "https://swapi.co/api/films/6/",
            "https://swapi.co/api/films/3/",
            "https://swapi.co/api/films/1/",
            "https://swapi.co/api/films/7/"};

    private static String[] species = {
            "https://swapi.co/api/species/1/"};

    private static String [] starships = {
            "https://swapi.co/api/starships/12/",
            "https://swapi.co/api/starships/22/"};

    private static String[] vehicles = {
            "https://swapi.co/api/vehicles/14/",
            "https://swapi.co/api/vehicles/30/"};

    public static People producePeople () {
        People people = new People();
        people.setBirth_year("19BBY");
        people.setCreated("2014-12-09T13:50:51.644000Z");
        people.setEdited("2014-12-20T21:17:56.891000Z");
        people.setEye_color("blue");
        people.setFilms(films);
        people.setGender("male");
        people.setHair_color("blond");
        people.setHeight("172");
        people.setHomeworld("https://swapi.co/api/planets/1/");
        people.setMass("77");
        people.setName("Luke Skywalker");
        people.setSkin_color("fair");
        people.setSpecies(species);
        people.setStarships(starships);
        people.setUrl("https://swapi.co/api/people/1/");
        people.setVehicles(vehicles);
        return people;
    }
}
