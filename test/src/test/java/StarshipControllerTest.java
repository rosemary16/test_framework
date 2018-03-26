import models.Starship;
import org.testng.annotations.Test;
import static client.implementation.StarshipClient.getStarshipClient;
import static matchers.Matchers.getMatcher;
import static producers.StarshipProducer.produceStarship;

@Test
public class StarshipControllerTest {
    public void getAccountByIdTest(){
        Starship expectedStarship = produceStarship();
        Starship actualStarship = getStarshipClient()
                .getStarshipById(5L)
                .expectedStatusCode(200)
                .readEntity();

        getMatcher(actualStarship, expectedStarship)
                .match();
    }

}
