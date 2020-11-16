package Encapsulation;

public class Cat extends Mammal {
    public boolean clean = true;

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
        System.out.println(cat.age);
        cat.eat();
        cat.move();
        System.out.println(cat.dogum);
        cat.meaw();
        System.out.println(cat.clean);

    }

    public void meaw(){
        System.out.println("Kedi Miyavlar");

    }
}
