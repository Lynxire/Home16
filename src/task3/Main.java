package task3;

import task2.Task2;

public class Main {
    public static void main(String[] args) {
        String balancedString = "([{{[(())]}}])";
        String unbalancedString = "{{[]()}}}}";

        System.out.println("Balanced String: " + Task3.isBalanced(balancedString));
        System.out.println("Unbalanced String: " + Task3.isBalanced(unbalancedString));
    }
}
