package com.example;

public class MoodAnalysisException extends Exception {

    private ExceptionType type;

    public ExceptionType getType() {
        return type;
    }

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
