//polymorphism - many forms , ability of an object to behave differently in different contexts
// 2 types - compile time and run time 
//compile time - functiona overloading and operator overloading

//1. run time - method overriding
public class Polymorphism {
    class Student {
        String name;
        int age;
        //method overloading- yaha pe printinfo same function me alag alag parameters ke sath use ho rha hai
        public void printInfo(String name) {
System.out.println("Name: " + name);
        }
        public void printInfo(int age) {
System.out.println("Age: " + age);
        }
        public void printInfo(String name, int age) {
System.out.println("Name: " + name + ", Age: " + age);
        }

    }

        public static void main(String args[]){
            Polymorphism outer = new Polymorphism();
            Student s1 = outer.new Student();

            s1.name = "Priya";
            s1.age = 21;
            s1.printInfo(s1.age);
            s1.printInfo(s1.name);
            s1.printInfo(s1.name, s1.age);
        }
    }
