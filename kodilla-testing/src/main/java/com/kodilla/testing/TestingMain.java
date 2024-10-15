package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAIL");
        }
        Calculator calculator = new Calculator();

        int addResult = calculator.add(10, 20);
        if (addResult == 30) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
        int subtractResult = calculator.subtract(20, 10);

        if (subtractResult == 10) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

    }
}
