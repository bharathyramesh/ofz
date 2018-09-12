package com.ofs.training;

public class Adder {

    public static void main(String[] args) {

        int length = args.length;
        Adder add = new Adder();
        add.summation(length, args);
    }

    private void summation(int length, String... args) {
        if (length < 1) {
            throw new RuntimeException("More than one number is required");
        }
        int num = 0;
        for (String number : args) {
            num += Integer.parseInt(number);
        }
        System.out.println(num);
    }
}
