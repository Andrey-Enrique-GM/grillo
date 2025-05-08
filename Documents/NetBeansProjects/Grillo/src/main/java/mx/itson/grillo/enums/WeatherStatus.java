
package mx.itson.grillo.enums;

// @author Andrey

import com.google.gson.annotations.SerializedName;


public enum WeatherStatus 
{
    
    @SerializedName("1")
    SUNNY,
    @SerializedName("2")
    SNOW,
    @SerializedName("3")
    RAIN,
    @SerializedName("4")
    UNKNOWN
    
}
