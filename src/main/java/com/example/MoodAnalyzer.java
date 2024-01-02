package com.example;

public class MoodAnalyzer<T> {
    private T message;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(T msg) {
        this.message = msg;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message == null) {
                throw new MoodAnalysisException(ExceptionType.NULL_MOOD, "Mood is null");
            }

            String messageStr = this.message.toString().trim().toLowerCase();
            if (messageStr.isEmpty()) {
                throw new MoodAnalysisException(ExceptionType.EMPTY_MOOD, "Mood is empty");
            }

            if (messageStr.contains("sad")) {
                return "Sad";
            }
            return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(ExceptionType.NULL_MOOD, "Mood is null");
        }

    }
}
