public class operators {
    public static void main(String[] args) {
/*
    //Operator - 4 types in java 1. Arithmetic 2. Assignment 3. Comparison 4. Logical
//1. Arithmetic Operators - +, -, *, /, % (modulus)
int a  =1;
int b = 2;
int sum = a+b;
System.out.println(sum);
int diff = b - a;
System.out.println(diff);
int prod = a * b;
System.out.println(prod);
int div = a/b; //yaha pe 0 hi print hoga kyuki dono int hain. agar hame decimal me result chahiye to hame ek variable double ka banana padega.
System.out.println(div);
int mod = b % a;
System.out.println(mod);

//2. Assignment Operators - =, +=, -=, *=, /=, %=
int c = 5;
c += 2; //c = c + 2
c++; //unary operator- increment operator which increases value by 1
System.out.println(c++); //yaha pe pehle c ki value print hogi fir increment hoga
System.out.println(++c); //yaha pe pehle c increment hoga fir print hoga
System.out.println(c); //abhi ki value print hogi
System.out.println(c--); //yaha pe pehle c ki value print hogi fir decrement hoga
System.out.println(--c); //yaha pe pehle c decrement hoga fir print hoga
System.out.println(c); //abhi ki value print hogi
*/

//Maths class in java
System.out.println(Math.min(5,6));
System.out.println(Math.max(5,6));
System.out.println(Math.sqrt(36));
System.out.println(Math.abs(-6)); //absolute value
System.out.println(Math.round(4.6f)); //ye nearest integer me convert kar de
System.out.println(Math.random()); //ye 0 se 1 ke beech me koi bhi random decimal value dega
System.out.println((int)(Math.random() * 100)); //ye 0 se 100 ke beech me koi bhi random integer value dega
    
}
}