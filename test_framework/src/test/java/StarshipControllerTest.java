import models.Starship;
import org.testng.annotations.Test;
import producers.StarshipProducer;

import static client.implementation.StarshipClient.getStarshipClient;
import static matchers.Matchers.getMatcher;

@Test
public class StarshipControllerTest {
    public void getStarshipByIdTest(){
        Starship expectedStarship = StarshipProducer.produceStarship();
        Starship actualStarship = getStarshipClient()
                .getStarshipById(StarshipProducer.starshipId)
                .expectedStatusCode(200)
                .readEntity();

        getMatcher(actualStarship, expectedStarship)
                .match();
    }

}
