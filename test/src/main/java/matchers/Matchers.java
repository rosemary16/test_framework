package matchers;

import matchers.implementation.StarshipMatcher;
import models.Starship;

public class Matchers {

    public static StarshipMatcher getMatcher(Starship actual, Starship expected) {
        return new StarshipMatcher(actual, expected);
    }
}