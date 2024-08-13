package org.example.observer_pattern;

public class PressureDisplay implements DisplayDevice
{
    float pressure;
    @Override
    public void update(float pressure)
    {
        this.pressure=pressure;
        System.out.println("Updated Pressure data:"+pressure);
    }
    public Types getType() {
        return Types.PRESSURE;
    }
}
