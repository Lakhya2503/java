package oops.Encapsulation;

public class Student {
        private String name;
        private  int age;
        private  int rollnumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "" ) {
            System.out.println("please enter a student name");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
        } else  {
            this.age = age;
        }
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        if (rollnumber < 0 ) {
            System.out.println("Invalid roll No.");
        } else {
             this.rollnumber = rollnumber;
        }
    }
}
