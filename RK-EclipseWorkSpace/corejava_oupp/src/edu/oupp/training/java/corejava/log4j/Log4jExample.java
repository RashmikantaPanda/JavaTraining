package edu.oupp.training.java.corejava.log4j;

import org.apache.log4j.*;

public class Log4jExample {
    static Logger logger= Logger.getLogger(Log4jExample.class);
    static{
        SimpleLayout layout=new SimpleLayout();
        ConsoleAppender appender=new ConsoleAppender(layout);

        logger.addAppender(appender);
        logger.setLevel(Level.ALL);
    }

    public static void main(String[] args) {
        logger.debug("Hello this is debug msg");
        logger.info("Hello this is info msg");
        logger.warn("Hello this is warn msg");
        Log4jExample ob=new Log4jExample();

        try{
            ob.divide(10,0);
            logger.info("Output");
        }
        catch (Exception e){
            logger.error("Sorry, Something went wrong");
        }
    }

    private void divide(int i, int i1) {
        System.out.println(i/i1);
    }
}



//add to log4j.properties

//#Root logger option
//log4j.rootLogger=DEBUG,stdout, file
//
//#Redirect log messages to console
//log4j.appender.stdout=org.apache.log4j.ConsoleAppender
//log4j.appender.stdout.Target=System.out
//log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
//log4j.appender.stdout.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L -%m%n
//
//#Redirect log messages to a log file, support file rolling
//log4j.appender.file=org.apache.log4j.RollingFileAppender
//log4j.appender.file.File=D:\\log4j-application.log
//log4j.appender.file.MaxFileSize=5MB
//log4j.appender.file.layout=org.apache.log4j.PatternLayout
//log4j.appender.file.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L -%m%n
