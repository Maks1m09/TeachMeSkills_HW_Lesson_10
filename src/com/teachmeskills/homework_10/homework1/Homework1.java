package com.teachmeskills.homework_10.homework1;

public class Homework1 {

    public static void documentNumberEndsOn(String num) {

        if (!num.endsWith("1a2b")) {
            try {
                throw new MyExceptionFor1Task("Follower not found");
            } catch (MyExceptionFor1Task e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("The entered string:" + num);
    }

    public static void sequence(String num) {
        if (!num.startsWith("555")) {
            try {
                throw new MyExceptionFor1Task("Follower not found");
            } catch (MyExceptionFor1Task e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("The entered string:" + num);
    }

    public static void certainSequence(String num) {
        if (!num.toLowerCase().contains("abc")) {
            try {
                throw new MyExceptionFor1Task("Follower not found");
            } catch (MyExceptionFor1Task e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("The entered string:" + num);
    }
}
