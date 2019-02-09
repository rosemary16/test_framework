package matchers.implementation;

import matchers.AbstractObjectEqualsMatcher;
import models.People;

public class PeopleMatcher extends AbstractObjectEqualsMatcher<People> {
    public PeopleMatcher(People actual, People expected) {
        super(actual, expected);
    }

    @Override
    public void addDefaultConditions() {
        add(People::getBirth_year, "");
        add(People::getName, "name");
        add(People::getHeight, "height");
        add(People::getMass, "mass");
        add(People::getHair_color, "hair_color");
        add(People::getSkin_color, "skin_color");
        add(People::getEye_color, "eye_color");
        add(People::getGender, "gender");
        add(People::getHomeworld, "homeworld");
        add(People::getFilms, "films");
        add(People::getSpecies, "species");
        add(People::getVehicles, "vehicles");
        add(People::getStarships, "starships");
        add(People::getCreated, "created");
        add(People::getEdited, "edited");
        add(People::getUrl, "url");
    }
}
