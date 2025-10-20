import java.util.*;

class Solution {
    public int evaluateInfix(String[] arr) {
        Stack<Integer> operands = new Stack<>();
        Stack<String> operators = new Stack<>();

        for (String token : arr) {
            if (isNumber(token)) {
                operands.push(Integer.parseInt(token));
            } else if (token.equals("(")) {
                operators.push(token);
            } else if (token.equals(")")) {
                while (!operators.peek().equals("(")) {
                    compute(operands, operators);
                }
                operators.pop(); // pop the '('
            } else { // operator
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(token)) {
                    if (token.equals("^") && operators.peek().equals("^")) break; // right-associative '^'
                    compute(operands, operators);
                }
                operators.push(token);
            }
        }

        while (!operators.isEmpty()) {
            compute(operands, operators);
        }

        return operands.pop();
    }

    private boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private int precedence(String op) {
        switch (op) {
            case "+": case "-": return 1;
            case "*": case "/": return 2;
            case "^": return 3;
            default: return 0;
        }
    }

    private void compute(Stack<Integer> operands, Stack<String> operators) {
        int b = operands.pop();
        int a = operands.pop();
        String op = operators.pop();
        operands.push(applyOp(a, b, op));
    }

    private int applyOp(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return (int)Math.floor((double)a / b); // floor division
            case "^": return (int)Math.pow(a, b);
            default: throw new IllegalArgumentException("Unknown operator: " + op);
        }
    }
}
