
package mx.itson.grillo.entities;

// @author Andrey

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import mx.itson.grillo.enums.WeatherStatus;


public class Forecast 
{
    
    private Date day;
    @SerializedName ("max_temperature")
    private int maxTemperature;
    @SerializedName ("min_temperature")
    private int minTemperature;
    private WeatherStatus status;
    
}
