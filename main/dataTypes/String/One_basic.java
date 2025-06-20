package dataTypes.String;

public class One_basic {
    public static void main(String [] args){

        CommonFileStudent student1 = new CommonFileStudent();
        student1.name = "laxman shinde";
        student1.Sub = "PCMB";
        student1.College = "HEB Amalner";
        student1.Year = 2024;

        System.out.println(student1.name + " is " + student1.Sub + " in year " + student1.Year);

        String a  = new String("lakhan");
        String b  = new String("lakhan");
        String c = "lakhan";
        String d = "lakhan";

        System.out.println(a == b);
        System.out.println(c == d);

    }
}
