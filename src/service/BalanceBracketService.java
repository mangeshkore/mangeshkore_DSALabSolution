package service;

import java.util.Stack;

public class BalanceBracketService {
    public boolean checkBalance(String expression) {
        if (expression.length() % 2 == 1)
            return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);

            if (character == '{' || character == '(' || character == '[')
                stack.push(character);
            else {
                char c = stack.pop();
                switch (character) {
                    case '}':
                        if (c != '{')
                            return false;
                        break;
                    case ')':
                        if (c != '(')
                            return false;
                        break;
                    case ']':
                        if (c != '[')
                            return false;
                        break;
                }
            }
        }
        return true;
    }
}
