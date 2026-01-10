abstract class Animal { 
  abstract  void walk();
  Animal() {
      System.out.println("you are creating an animal");
  }
  public void eat() {
      System.out.println("Animal eats food");
  }
}
class Horse extends Animal {
    Horse() {
        System.out.println("you are creating a horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class abstraction {
  public static void main(String[] args) {
Horse horse = new Horse();
horse.walk();
/*Animal animal = new Animal();
animal.walk();*/ //ye error dega kyuki abstract class ka object nahi bna skte
Chicken chicken = new Chicken();
chicken.walk();
horse.eat();
chicken.eat();
   } 
}
