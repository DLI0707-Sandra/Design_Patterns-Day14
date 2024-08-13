package org.example.observer_pattern;

public interface WeatherData
{
    public void addObserver(DisplayDevice device);
    public void removeObserver(DisplayDevice device);
    public void notifyObservers(Weather weather);
}
