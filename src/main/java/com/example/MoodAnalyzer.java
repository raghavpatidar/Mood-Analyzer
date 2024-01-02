package com.example;

public class MoodAnalyzer<T> {
    private T message;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(T msg) {
        this.message = msg;
    }

    public String analyseMood() {
        try {
            if (this.message == null) {
                // Handle null mood scenario
                return "Happy";
            }

            String messageStr = this.message.toString().toLowerCase();
            if (messageStr.contains("sad"))
                return "Sad";
            return "Happy";
        } catch (NullPointerException e) {
            // Handle other potential null pointer exceptions
            return "Happy";
        }
        // String messageStr = this.message.toString().toLowerCase();
        // if (messageStr.contains("sad"))
        // return "Sad";
        // return "Happy";
    }
}
