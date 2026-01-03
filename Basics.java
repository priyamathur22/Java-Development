import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
//VARIABLES
String name = "Priya";
String Surname = "Mathur";
int age = 30;
String title = Surname; //ek variable ki value dusre ko assign kr sakte hain
System.out.println("My name is " + name + " " + Surname + " and my age is " + age);

//DATATYPES
//1. Primitive- store local values
//it has fixed size
byte age2 = 22;
int phone = 1234567890;
long phone2 = 1234567890123L;
float price = 10.99f;
double price2 = 20.99;
char grade = 'A';
boolean isAdult = true;
System.out.println("Age: " + age);
System.out.println("Phone: " + phone);
System.out.println("Phone2: " + phone2);
System.out.println("Price: " + price);
System.out.println("Price2: " + price2);
System.out.println("Grade: " + grade);
System.out.println("Is Adult: " + isAdult);
   

//2. Non-Primitive- store value by reference of multiple values
 //it is a class which has not fixed size
String name3 = "Priya_Mathur";
System.out.println(name.length()); //length is a method of string class which gives length of string
System.out.println(name.toUpperCase()); //toUpperCase is a method of string class which
// new keyword is used to create object of class which used to declare non-primitive data types
// some keyword are fixed but new is used to create object of class
String name4 = new String("Hello_World");
System.out.println(name4.toLowerCase());


//How to take input from user
Scanner sc = new Scanner(System.in);
System.out.println("Enter your age: ");
int userAge = sc.nextInt(); //for integer input
System.out.println("Your age is: " + userAge);
System.out.println("Enter your name: ");
String userName = sc.next(); //for single word input
System.out.println("Your name is: " + userName); //take input a word
String fullName = sc.nextLine();//agar pura line lena h to nextLine() method ka use karna hoga
System.out.println("Enter your full name: ");
fullName = sc.nextLine();
System.out.println("Your full name is: " + fullName);

}
}
