package Abstraction01;

public class Abstraction2 extends  Abstraction1{

    public static void main (String[] args){
        Abstraction2 obj = new Abstraction2();
        obj.abstractMethod();
        obj.concreteMethod();
    }

    public void abstractMethod(){
        System.out.println(" Bu abstract methodun override edilmis sekli");
    }
}
