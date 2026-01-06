//OBJECTS AND CLASSES
//CLASS is a blueprint from which we can create multiple objects
//Object is an instance of a class by which we can access the attributes and methods defined in the class
class objects {
    String color; // attribute
    String type;// attribute
    public void write(){ //function
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color); // this keyword use kar rahe hia to refer current object
    }
}

class Student {
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    Student(){ // no-arg constructor
        System.out.println("Constructor called");
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Priya";
        s1.age = 21;
        s1.printInfo();

        objects pen1 = new objects(); // creating object,isme class ka jo naam hia wo likhna hai then objects creae hot ahia jaise pen 1 objects banaya hia
        pen1.color = "blue";//yaha attribute ko access kar rahe objects ke saath dot operator se
        pen1.type = "gel";
        objects pen2 = new objects();
        pen2.color = "black";
        pen2.type = "ballpoint";
        pen1.printColor(); //function call
        pen2.printColor(); //function call
        pen1.write(); //function call
}
        

        
    

}
