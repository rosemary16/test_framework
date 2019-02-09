package matchers.implementation;

import matchers.AbstractObjectEqualsMatcher;
import models.Starship;

public class StarshipMatcher extends AbstractObjectEqualsMatcher<Starship> {

    public StarshipMatcher(Starship actual, Starship expected) {
        super(actual, expected);
    }

    @Override
    public void addDefaultConditions() {
        add(Starship::getName, "name");
        add(Starship::getModel, "model");
        add(Starship::getEdited, "edited");
        add(Starship::getMGLT, "MGLT");
        add(Starship::getCargo_capacity, "cargo_capacity");
        add(Starship::getStarship_class, "starship_class");
        add(Starship::getCrew, "crew");
        add(Starship::getFilms, "films");
        add(Starship::getUrl, "url");
        add(Starship::getHyperdrive_rating, "hyperdrive_rating");
        add(Starship::getPassengers, "passengers");
        add(Starship::getPilots, "pilots");
        add(Starship::getCreated, "created");
        add(Starship::getConsumables, "consumables");
        add(Starship::getManufacturer, "manufacturer");
        add(Starship::getLength, "length");
        add(Starship::getMax_atmosphering_speed, "max_atmosphering_speed");
        add(Starship::getCost_in_credits, "cost_in_credits");
    }

    public StarshipMatcher withCrew(String crew) {
        softAssert.assertEquals(actual.getCrew(), crew, "crew");
        return this;
    }

    public StarshipMatcher withName(String name) {
        softAssert.assertEquals(actual.getName(), name, "name");
        return this;
    }

    public StarshipMatcher withModel(String model) {
        softAssert.assertEquals(actual.getModel(), model, "model");
        return this;
    }
}