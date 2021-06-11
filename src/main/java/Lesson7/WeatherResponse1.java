package Lesson7;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

public class WeatherResponse1 {
    private String date;
    private String temperature;
    private String text;
    private String cityName;
    private String cityKey;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityKey() {
        return cityKey;
    }

    public void setCityKey(String cityKey) {
        this.cityKey = cityKey;
    }

    public WeatherResponse1(String date, String temperature, String text, String cityName, String cityKey) {
        this.date = date;
        this.temperature = temperature;
        this.text = text;
        this.cityName = cityName;
        this.cityKey = cityKey;
    }

    public WeatherResponse1() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "На " + this.getDate() + " ожидается " + this.getText().toLowerCase() + ". Температура достигнет " + this.getTemperature() + " градусов\n";
    }


}
