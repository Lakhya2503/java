public class DataTypes {
    //Mainly Two Types of Data Types
//    I.Primitive Data Types
//    II. Non Premitive (Refrense) Data Types

//---------------------------------------------------------------------------------------------------
//    I . Primitive
//    1.Integer
            byte myByte = 127;          // 8-bit, range: -128 to 127
            short myShort = 32767;      // 16-bit, range: -32,768 to 32,767
            int myInt = 2147483647;     // 32-bit, range: -2^31 to 2^31-1
            long myLong = 9223372036854775807L; // 64-bit, suffix 'L' or 'l'


//---------------------------------------------------------------------------------------------------

// 2 .Floating-Point
            float myFloat = 3.4028235E38f;  // 32-bit, suffix 'F' or 'f'
            double myDouble = 1.7976931348623157E308; // 64-bit (default for decimals)


//---------------------------------------------------------------------------------------------------

// 3.Character
            char myChar = 'A';          // 16-bit Unicode character, single quotes


//---------------------------------------------------------------------------------------------------

  // 4.Boolean
             boolean myBoolean = true;    // true or false

//---------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------

//II. Reference Data Types
//    1.String

            String myString = "Hello World";  // Sequence of characters, double quotes


//---------------------------------------------------------------------------------------------------

// 2.Arrays
            int[] myIntArray = {1, 2, 3};          // Array of integers
            String[] myStringArray = {"A", "B"};    // Array of strings


//---------------------------------------------------------------------------------------------------

//    3.Classes
                // Assuming we have a class called Person
            Person person = new Person("John", 30);

//---------------------------------------------------------------------------------------------------


// 4.Interfaces
            List<String> myList = new ArrayList<>();  // List interface implementation


//---------------------------------------------------------------------------------------------------


    public class DataTypesExample {
        public static void main(String[] args) {
            // Primitive types
            byte age = 25;
            short population = 30000;
            int distance = 1500000000;
            long globalPopulation = 7800000000L;

            float price = 19.99f;
            double pi = 3.141592653589793;

            char grade = 'A';
            boolean isJavaFun = true;

            // Reference types
            String message = "Learning Java Data Types";
            int[] numbers = {1, 2, 3, 4, 5};

            System.out.println("Age: " + age);
            System.out.println("Price: " + price);
            System.out.println("Grade: " + grade);
            System.out.println("Message: " + message);
            System.out.println("First number: " + numbers[0]);

        }
    }

//---------------------------------------------------------------------------------------------------

//             Primitive types store actual values directly in memory
//
//            Reference types store references (memory addresses) to objects
//
//            Default values:
//
//            Numeric primitives: 0
//
//            boolean: false
//
//            char: '\u0000'
//
//            Reference types: null

//---------------------------------------------------------------------------------------------------

}
