package com.example.java2022homework5.core.logging;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String log) {
        System.out.println("Veritabanına loglandı : " +log);
    }
}
