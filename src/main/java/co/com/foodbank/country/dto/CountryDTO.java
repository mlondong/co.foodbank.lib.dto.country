package co.com.foodbank.country.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.country.dto 16/05/2021
 */
public class CountryDTO {

    @NotNull
    @NotBlank(message = "Country must be completed.")
    public String name;


    public CountryDTO() {}

    public CountryDTO(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
