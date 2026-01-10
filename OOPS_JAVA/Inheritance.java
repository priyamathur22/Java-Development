//inheritance - acquiring properties of parent class by child class
//4 types - single, multilevel, hierarchical, multiple (not supported in java)
//single - one parent one child
class Shape {
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println(1/2*l*h);

    }
}
//multilevel inheritance using interfaces
/*class EuilateralTriangle extends Triangle {
    public void area(int l ,int h){
        System.out.println((Math.sqrt(3)/4)*l*h);
    }
}*/

//hierarchical inheritance
class Circle extends Shape {
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class Inheritance {
   public static void main (String[] args) {

   } 
}
