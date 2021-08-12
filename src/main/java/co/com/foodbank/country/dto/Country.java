package co.com.foodbank.country.dto;

import co.com.foodbank.country.interfaces.ICountry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.country.dto 16/05/2021
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country implements ICountry {

    public String name;

    @Override
    public String getName() {
        return name;
    }



}
