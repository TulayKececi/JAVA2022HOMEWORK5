package com.example.java2022homework5.core.logging;

public class MailLogger implements ILogger{
    @Override
    public void log(String log) {
        System.out.println("Mail gönderildi : " +log);
    }
}
