public class Conversion {
    public static void main (String[] args) {
        int age = 23;
        long ageUpdate = (long) age;
        //when u hold a variable then make sure the later to store variable is big than after variable otherwise the variable is not the big then chanses to data will be loss
        System.out.println(ageUpdate);

        // for ex :
        int marks = 151;
        byte marksUpdate = (byte)marks;
        System.out.println(marksUpdate);
        // In this case data will be loss beacuse the after variable is big than later one that's why the data will be loss=
    }
}
