import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        /* 
        //loops in java
        //1. for loop
        for (int i = 0; i <= 100; i =i+1) {
            System.out.println("" + i); //print numbers from 0 to 100
        }
        for (int i = 100; i >= 0; i--) {
            System.out.println("" + i); //print numbers from 100 to 0
        }

        //2. while loop
        int j = 1; //while loop ke liye hame loop variable ko bahar declare karna padta hia
        while (j <= 5) {
            System.out.println("" + j);
            j++;
        }
        int n = 5;
        while (n >= 1) {
            System.out.println("" + n);
            n--;
        }

        //3. do-while loop - ye kam se kam ek baar to chalega hi chahe condition false hi kyu na ho
        int k = 100;
        do {
            System.out.println("" + k);
            k--;
        } while (k >= 7);

        */ 
       /* 
Scanner sc = new Scanner(System.in);
int num = 0;
do {
    System.out.println("Enter a number (0 to exit): ");
    num = sc.nextInt();
    System.out.print("You entered: " + num);
    System.out.println(num);
} while(num >= 0);
System.out.println("Exited the loop.");


//4. for-each loop - ye loop sirf array aur collection ke sath hi use hota hia
int [] marks = {97, 98, 95, 99, 100};

for (int element : marks) {
    System.out.println(element);
}
    

//nested loops
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }}
        */

    //Break and Continue statements
    int i = 0;
    while(true){ //infinite loop
        if (i == 3){
            i++;
            continue; //skip the iteration when i=3
        }
        System.out.println(i);
        i++;
        if(i>5){
            break;
        }
    }
    }
}
