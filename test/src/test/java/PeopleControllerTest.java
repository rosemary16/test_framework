import client.implementation.PeopleClient;
import models.People;
import models.Starship;
import org.testng.annotations.Test;
import producers.PeopleProducer;

import static matchers.Matchers.getMatcher;

@Test
public class PeopleControllerTest {
    public void getPeopleByIdTest(){
        People expectedPeople = PeopleProducer.producePeople();
        People actualPeople = PeopleClient.getPeopleClient()
                .getPeopleById(PeopleProducer.peopleId)
                .expectedStatusCode(200)
                .readEntity();

        getMatcher(actualPeople, expectedPeople)
                .match();
    }

}
