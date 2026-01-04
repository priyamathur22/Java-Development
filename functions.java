import java.util.Arrays;
import java. util.Scanner;

public class functions {
    public static void printjava() {
        System.out.println("Hello Java");
    }

    public static void printName(String name) {
        System.out.println(name);
    }
   public static void Sum(int a, int b) {
    int sum = a+b;
    System.out.println("Sum is: " + sum);
   }
    public static void main(String[] args) {
printjava(); //function call
printjava();
printjava();

printName("Priya");
printName("Mathur");

Sum(5, 10);
    }
}
