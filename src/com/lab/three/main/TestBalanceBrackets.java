package com.lab.three.main;

import com.lab.three.service.BalanceBracketService;

/**
 * Solution for Question 1
 */
public class TestBalanceBrackets {
    public static void main(String[] agrs) {

        BalanceBracketService balanceBracketService = new BalanceBracketService();

        //Input string
        String expression = "(([[{}]]))";

        //Output
        if (balanceBracketService.checkBalance(expression)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
}
