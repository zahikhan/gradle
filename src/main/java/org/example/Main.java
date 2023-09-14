package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.exit(2);
        }
        Calculator calculator = new Calculator();
        Integer i = Integer.valueOf(args[1]);
        Integer j = Integer.valueOf(args[2]);

        String arg = args[0];
        if ("add".equals(arg)) {
            System.out.println(calculator.add(i, j));
        } else if ("sub".equals(arg)) {
            System.out.println(calculator.subtract(i, j));
        } else if ("div".equals(arg)) {
            System.out.println(calculator.divide(i, j));
        }

    }
}
