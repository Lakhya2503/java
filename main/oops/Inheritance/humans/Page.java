package oops.Inheritance.humans;

public class Page {
        public static void  main (String... args) {

            Grandparent grandparent = new Grandparent();
            grandparent.setAge(65);
            grandparent.setName("Ranga");
            System.out.println("The " + grandparent.getName() + " was " + grandparent.getAge() + " year old...");

            Parent parent = new Parent();
            parent.setAge(45);
            parent.setName("Mohan");
            System.out.println("The " + parent.getName() + " was " + parent.getAge() + " year old...");

            Child child = new Child();
            child.setAge(20);
            child.setName("Aryan");
            System.out.println("The " + child.getName() + " was " + child.getAge() + " year old...");


        }


        // multiple inheritance
}
