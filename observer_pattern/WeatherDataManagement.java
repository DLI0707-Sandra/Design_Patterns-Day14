package org.example.observer_pattern;

public class WeatherDataManagement
{
    public static void main(String[] args)
    {
        WeatherDataClass weatherData=new WeatherDataClass();
        DisplayDevice device1=new HumidityDisplay();
        DisplayDevice device2=new TemperatureDisplay();
        DisplayDevice device3=new PressureDisplay();

        weatherData.addObserver(device1);
        weatherData.addObserver(device2);
        weatherData.addObserver(device3);

        Weather weather1=new Weather();
        weather1.value=25;
        weather1.type=Types.TEMPERATURE;

        Weather weather2=new Weather();
        weather2.value=5;
        weather2.type=Types.PRESSURE;

        Weather weather3=new Weather();
        weather3.value=10;
        weather3.type=Types.HUMIDITY;

        weatherData.notifyObservers(weather1);
        weatherData.notifyObservers(weather2);
        weatherData.notifyObservers(weather3);


    }
}
