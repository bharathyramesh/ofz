package com.ofs.training;

// public class Vararg {
public class Vararg {

    static int id = 0;

    // Vararg(int... firstVariable) {
    public Vararg(int... firstVariable) {
        for (int SecondVariable : firstVariable) {
            // Console console = getConsole()
            // console.print(data)
            System.out.println(SecondVariable);
        }
    }


    // Vararg(int... firstVariable, String... name) {
    public Vararg(int firstVariable, String... name) {
        for (String Name : name) {
            id = id + 1;
            // Console console = getConsole()
            // console.print(data)
            System.out.println(Name + "id is" + id);
        }
    }

    // static execute () {
    public static void main(String[] args) {

        // Vararg var = new Vararg(arguments)
        Vararg var  = new Vararg(1, "Bharathy");
        Vararg firstVar = new Vararg(2, "ManiBharathy", "Bharathy", "Vinoth");
        Vararg secondVar = new Vararg(1, 2, 3, 4);
        Vararg thirdVar = new Vararg();
    }
}
