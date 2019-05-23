package ru.bikert.learning;

public interface Logger {

    void log(String message);
    void log(String message, Object...objects);
}
