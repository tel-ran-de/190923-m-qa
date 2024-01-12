package org.example;

public class Logging {
    public static void main(String[] args) {
        LogSoutClass logSout = new LogSoutClass();
        logSout.logging();
        LogFileClass logFile = new LogFileClass();
        logFile.logging();

        LogSoutExampleClass cl = new LogSoutExampleClass();
        cl.logging();

    }
}
