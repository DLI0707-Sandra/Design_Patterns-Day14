package org.example.singleton_pattern;

public class LoggingApplication extends Thread
{
    static int count=0;
    public void run()
    {
        Logger logger=Logger.getInstance();
        logger.addLog("log "+count++);
    }
    public static void main(String[] args) throws InterruptedException {
        LoggingApplication application1=new LoggingApplication();
        application1.start();
        LoggingApplication application2=new LoggingApplication();
        application2.start();
        Thread.sleep(1000);
        Logger.viewLogs();
    }
}
