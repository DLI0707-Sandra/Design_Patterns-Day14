package org.example.observer_pattern;

public class HumidityDisplay implements DisplayDevice
{
    float humidity;
    @Override
    public void update(float humidity)
    {
        this.humidity=humidity;
        System.out.println("Updated Humidity data:"+humidity);
    }
    public Types getType() {
        return Types.HUMIDITY;
    }
}
