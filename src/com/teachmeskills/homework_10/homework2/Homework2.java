package com.teachmeskills.homework_10.homework2;

public class Homework2 {

    public static boolean isTrue(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() < 20) {
            throw new WrongLoginException("Check login length");
        }
        if (login.length() != login.replaceAll("\\s+", "").length()) {
            throw new WrongLoginException("Login contains a space");
        }
        if (password.length() < 20) {
            throw new WrongPasswordException("Check password length");
        }
        if (password.length() != password.replaceAll("\\s+", "").length()) {
            throw new WrongPasswordException("Password contains a space");
        }
        if (!password.contains("0") && !password.contains("1") && !password.contains("2") && !password.contains("3") && !password.contains("4") && !password.contains("5") && !password.contains("6") && !password.contains("7") && !password.contains("8") && !password.contains("9")) {
            throw new WrongPasswordException("Passport does not contain a number");
        }
        if (!password.equalsIgnoreCase(confirmPassword)) {
            throw new WrongPasswordException("Passport and confirm Password are not equal");
        }
        return true;
    }
}

