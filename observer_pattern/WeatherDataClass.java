package org.example.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataClass implements WeatherData
{
    List<DisplayDevice>devices=new ArrayList<>();
    @Override
    public void addObserver(DisplayDevice device)
    {
        devices.add(device);
    }

    @Override
    public void removeObserver(DisplayDevice device)
    {
        devices.remove(device);
    }

    @Override
    public void notifyObservers(Weather weather)
    {
        for(int i = 0; i < devices.size(); i++) {
            if(weather.type == devices.get(i).getType())
                devices.get(i).update(weather.value);
        }
    }

}
