package Encapsulation;

public class Dog extends Mammal {

    public boolean sadik = true;

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.age);
        System.out.println(dog.name);
        dog.eat();
        dog.move();
        System.out.println(dog.dogum);
        dog.feed();
        System.out.println(dog.sadik);
        dog.bark();

    }
    public void bark(){
        System.out.println("Kopek havlar");

    }
}
