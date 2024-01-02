package com.example;

public class MoodAnalyzer<T> {
    private T message;

    public MoodAnalyzer(T msg) {
        this.message = msg;
    }

    public String analyseMood() {
        String messageStr = this.message.toString().toLowerCase();
        // messageStr.contain

        if (messageStr.contains("happy"))
            return "Happy";
        else if (messageStr.contains("sad"))
            return "Sad";

        return "Unable to determine Mood";
    }
}
