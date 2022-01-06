package com.teachmeskills.homework_10.homework2;

public class Runner {
    public static void main(String[] args) {
        try {
            Homework2.isTrue("1222222222222222222222222", "srdgdgergergergregeg5", "srdgdgergergergregeg4");
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}
