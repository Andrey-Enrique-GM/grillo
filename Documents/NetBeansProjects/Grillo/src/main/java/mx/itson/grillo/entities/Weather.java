
package mx.itson.grillo.entities;

// @author Andrey

import java.util.List;
import mx.itson.grillo.enums.WeatherStatus;


public class Weather 
{
    
    private String city;
    private int temperature;
    private int humidity;
    private WeatherStatus status;
    //@SerializedName ("wind_speed")
    private int windSpeed;
    // Esto es una composicion!!!
    private List<Forecast> forecast;
    
}
