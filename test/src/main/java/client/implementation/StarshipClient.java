package client.implementation;

import client.Configuration;
import client.ResponseWrapper;
import client.RestClient;
import models.Starship;
import utility.XmlPropertyLoader;

public class StarshipClient extends RestClient<StarshipClient> {
    private static String STARSHIP = "starships/%d/";

    private static StarshipClient client = new StarshipClient();

    private StarshipClient() {}

    public static StarshipClient getStarshipClient() {
        return client;
    }

    protected Configuration defaultConfiguration() {
        return new Configuration(XmlPropertyLoader.loadProperty("base.url"),
                "application/json", "");
    }

    public ResponseWrapper<Starship> getStarshipById(Long starshipId) {
        return get(String.format(STARSHIP, starshipId), Starship.class);
    }
}
