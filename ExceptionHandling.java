package com.ofs.training;

public class ExceptionHandling {

    void division(int first, int second) {
        /* try {
            int result = first / second;
            System.out.println(result);
        } catch (Exception e) {
            ownException("it is infinite");
        } */
        if (second != 0) {
            System.out.println(first / second);
        } else {
            try {
            throw new OwnException("it can't be zero");
            } catch (OwnException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        int firstElement = 5;
        int secondElement = 0;

        ExceptionHandling ex = new  ExceptionHandling();
        ex.division(firstElement, secondElement);
    }
}


class OwnException extends Exception {
    public OwnException(String exp) {
        super(exp);
    }
}
 