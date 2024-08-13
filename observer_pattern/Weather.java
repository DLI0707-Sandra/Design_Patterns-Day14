package org.example.observer_pattern;

enum Types{TEMPERATURE,PRESSURE,HUMIDITY}
public class Weather
{
    float value;
    Types type;

    public float getValue() {
        return value;
    }

    public Types getType() {
        return type;
    }

    @Override
    public String toString() {
        return type+" value:"+value;
    }
}
