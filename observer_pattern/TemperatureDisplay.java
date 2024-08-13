package org.example.observer_pattern;

public class TemperatureDisplay implements DisplayDevice
{
    float temperature;
    @Override
    public void update(float temperature) {
        this.temperature=temperature;
        System.out.println("Updated Temperature data:"+temperature);
    }

    @Override
    public Types getType() {
        return Types.TEMPERATURE;
    }
}
