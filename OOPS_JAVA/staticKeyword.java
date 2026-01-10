//static keyword is use to create variables and methods that belong to the class, rather than to any specific instance of the class.
class Student {
    String name;
    static String school; // static variable
    public static void changeSchool(String newSchool) {
        school = "newSchool"; // static method to change static variable
}
}



public class staticKeyword {
    public static void main(String[] args) {
        Student.school = "BVP"; // setting static variable
        Student s1 = new Student();
        s1.name = "Priya";
        Student s2 = new Student();
        s2.name = "Mathur";
        System.out.println(s1.name + " studies in " + Student.school);
        System.out.println(s2.name + " studies in " + Student.school);
    }
}
