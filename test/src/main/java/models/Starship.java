package models;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class Starship {
    private String edited;
    private String model;
    private String MGLT;
    private String cargo_capacity;
    private String starship_class;
    private String crew;
    private String[] films;
    private String url;
    private String hyperdrive_rating;
    private String passengers;
    private String[] pilots;
    private String created;
    private String consumables;
    private String manufacturer;
    private String name;
    private String length;
    private String max_atmosphering_speed;
    private String cost_in_credits;

    @JsonProperty("MGLT")
    public String getMGLT() {
        return MGLT;
    }
}
