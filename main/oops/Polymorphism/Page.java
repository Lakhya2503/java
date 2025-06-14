package oops.Polymorphism;

public class Page {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sayHello();


        Animal dog  = new Dog();
        dog.sayHello();

        Animal cat = new Cat();
        cat.sayHello();
    }
}
