package oops;

public class StudentClass {
    public static  class Student{
        String studentName;
        String std;
        int rollNumber;
        double CGPA;
    }

    public static void main (String [] args) {
        Student fistStudent = new Student();
        fistStudent.studentName = "Laxman Shinde";
        fistStudent.std = "10th";
        fistStudent.rollNumber = 12;
        fistStudent.CGPA = 8.42;
        System.out.println(fistStudent.studentName + " is on " + fistStudent.std + " pass on "+ fistStudent.CGPA + " CGPA and he is roll no. is " + fistStudent.rollNumber);



    }

}
