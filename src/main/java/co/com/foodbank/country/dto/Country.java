package co.com.foodbank.country.dto;

/**
 * @author mauricio.londono@gmail.com co.com.foodbank.country.dto 16/05/2021
 */
public class Country implements ICountry {
    public String name;


    public Country() {}

    public Country(String name) {
        super();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }



}
