package com.teachmeskills.homework_10.homework1;

public class MyExceptionFor1Task extends Exception {
    public MyExceptionFor1Task() {
    }

    public MyExceptionFor1Task(String message) {
        super(message);
    }

    public MyExceptionFor1Task(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExceptionFor1Task(Throwable cause) {
        super(cause);
    }

    public MyExceptionFor1Task(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

