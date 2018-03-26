package producers;

import models.Starship;

public class StarshipProducer {

    private static String[] films = {"https://swapi.co/api/films/1/"};
    private static String[] pilots = {};

    public static Starship produceStarship() {

        Starship starship = new Starship();
        starship.setCargo_capacity("180000");
        starship.setConsumables("1 month");
        starship.setCost_in_credits("240000");
        starship.setCreated("2014-12-10T15:48:00.586000Z");
        starship.setCrew("5");
        starship.setEdited("2014-12-22T17:35:44.431407Z");
        starship.setFilms(films);
        starship.setHyperdrive_rating("1.0");
        starship.setLength("38");
        starship.setManufacturer("Sienar Fleet Systems, Cyngus Spaceworks");
        starship.setMax_atmosphering_speed("1000");
        starship.setMGLT("70");
        starship.setModel("Sentinel-class landing craft");
        starship.setName("Sentinel-class landing craft");
        starship.setPassengers("75");
        starship.setPilots(pilots);
        starship.setStarship_class("landing craft");
        starship.setUrl("https://swapi.co/api/starships/5/");
        return starship;
    }
}
