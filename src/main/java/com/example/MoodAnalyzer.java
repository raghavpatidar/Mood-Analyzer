package com.example;

public class MoodAnalyzer<T> {
    private T message;

    MoodAnalyzer(T msg) {
        this.message = msg;
    }

    public String analyseMood() {
        String messageStr = this.message.toString();

        if (messageStr.contains("happy"))
            return "Happy Mood";
        else if (messageStr.contains("sad"))
            return "Sad Mood";

        return "Unable to determine Mood";
    }
}
