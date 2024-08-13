package org.example.singleton_pattern;

import java.util.ArrayList;
import java.util.List;

public class Logger
{
    private static Logger instance;

    private static List<String>logs=new ArrayList<>();

    private Logger(){}

    synchronized public static Logger getInstance()
    {
        if(instance==null)
            instance= new Logger();
        return instance;
    }

    void addLog(String log)
    {
        logs.add(log);
    }

    public static void viewLogs()
    {
        System.out.println(logs);
    }
}
