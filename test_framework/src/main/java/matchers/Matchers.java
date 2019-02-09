package matchers;

import matchers.implementation.PeopleMatcher;
import matchers.implementation.StarshipMatcher;
import models.People;
import models.Starship;

public class Matchers {

    public static StarshipMatcher getMatcher(Starship actual, Starship expected) {
        return new StarshipMatcher(actual, expected);
    }

    public static PeopleMatcher getMatcher(People actual, People expected) {
        return new PeopleMatcher(actual, expected);
    }
}