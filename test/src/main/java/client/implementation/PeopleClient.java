package client.implementation;

import client.Configuration;
import client.ResponseWrapper;
import client.RestClient;
import models.People;
import utility.XmlPropertyLoader;

public class PeopleClient extends RestClient<PeopleClient> {
    private static String PEOPLE = "people/%d/";

    private static PeopleClient client = new PeopleClient();

    private PeopleClient() {}

    public static PeopleClient getPeopleClient() {
        return client;
    }

    protected Configuration defaultConfiguration() {
        return new Configuration(XmlPropertyLoader.loadProperty("base.url"),
                "application/json", "");
    }

    public ResponseWrapper<People> getPeopleById(Long peopleId) {
        return get(String.format(PEOPLE, peopleId), People.class);
    }
}
