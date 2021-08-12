package co.com.foodbank.country.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.country.dto 16/05/2021
 */
@Data
@NoArgsConstructor
public class CountryDTO {

    @NotNull
    @NotBlank(message = "Country must be completed.")
    public String name;

}
