package com.example.java2022homework5.core.logging;

public class FileLogger implements ILogger{
    @Override
    public void log(String log) {
        System.out.println("Dosyaya loglandı : " +log);
    }
}
