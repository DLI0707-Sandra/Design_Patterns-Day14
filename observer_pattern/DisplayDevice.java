package org.example.observer_pattern;

public interface DisplayDevice
{
//    public void update(float temperature, float humidity,float pressure);
    public void update(float value);
    public Types getType();
}
