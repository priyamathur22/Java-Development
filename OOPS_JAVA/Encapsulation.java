class Student {

    // private data members (data hiding)
    private String name;
    private int age;

    // public setter method to set name
    public void setName(String name) {
        this.name = name;
    }

    // public getter method to get name
    public String getName() {
        return name;
    }

    // public setter method to set age
    public void setAge(int age) {
        if (age > 0) {           // validation
            this.age = age;
        }
    }

    // public getter method to get age
    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Student s1 = new Student();

        // setting values using setter methods
        s1.setName("Priya");
        s1.setAge(21);

        // accessing values using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
