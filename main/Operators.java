public class Operators {
    public static void main (String[] args) {
        // 1. Arithmetic operators
        int a = 9;
        int b = 2;

        // Basic arithmetic operations (commented out)
        // System.out.println(a + b); // addition (11)
        // System.out.println(a - b); // subtraction (7)
        // System.out.println(a * b); // multiplication (18)
        // System.out.println(a / b); // integer division (4)
        // System.out.println(a % b); // modulo (remainder = 1)

        // Storing result in another variable with type casting
//        double c = (double)a / b; // Type casting to get decimal result

        /* Explanation of type casting:
         * - a and b are both integers
         * - Integer division (a/b) would give 4 (truncates decimal)
         * - By casting 'a' to double first, we force floating-point division
         * - Equivalent to: 9.0 / 2 → 4.5
         * - Without casting: 9 / 2 → 4 (integer division)
         */

//        System.out.println("Divide a / b is: " + c); // Prints 4.5


//----------------------------------------------------------------------------------------------------------


        // 2. Assignment operators

        int k = 10; // Simple assignment

        // Compound assignment operators
//        k += 5;  // Equivalent to: k = k + 5
//        System.out.println("After += 5: " + k); // 15

//        k -= 3;  // Equivalent to: k = k - 3
//        System.out.println("After -= 3: " + k); // 12

//        k *= 2;  // Equivalent to: k = k * 2
//        System.out.println("After *= 2: " + k); // 24

//        k /= 4;  // Equivalent to: k = k / 4
//        System.out.println("After /= 4: " + k); // 6

//        k %= 5;  // Equivalent to: k = k % 5
//        System.out.println("After %= 5: " + k); // 1

        // Special cases with type conversion
//        byte f = 2;
//        f *= 3;  // No explicit cast needed (auto-cast by compiler)
        // f = f * 3; // This would require casting because result is int

//        System.out.println("Final byte value: " + f); // 6


//----------------------------------------------------------------------------------------------------------


        // 3. relational operators
        int x = 10, y = 5;

        // Equality operators
//        System.out.println(x == y);  // false (Equal to)
//        System.out.println(x != y);  // true (Not equal to)

        // Comparison operators
//        System.out.println(x > y);   // true (Greater than)
//        System.out.println(x < y);   // false (Less than)
//        System.out.println(x >= y);  // true (Greater than or equal to)
//        System.out.println(x <= y);  // false (Less than or equal to)

        // Real-world example
//        int age = 18;
//        boolean isAdult = age >= 18;  // true



//----------------------------------------------------------------------------------------------------------


        // 4. Logical Operator

        boolean p = true ,  q = true ;

//        System.out.println( p && q); // true && true = true otherwise false
//        System.out.println( true || false); // false || false = false otherwise true
//        System.out.println(!p); // true is false and false is true


//----------------------------------------------------------------------------------------------------------


        // 5. Bitwise Operators

        int l = 10;  // Binary: 1010
        int m = 3;   // Binary: 0011

        // Basic bitwise operations
        //System.out.println(l | m);   // Bitwise OR: 1010 | 0011 = 1011 (11)
        //System.out.println(l & m);   // Bitwise AND: 1010 & 0011 = 0010 (2)
        //System.out.println(l ^ m);   // Bitwise XOR: 1010 ^ 0011 = 1001 (9)
        //System.out.println(~m);      // Bitwise NOT: ~0011 = 1100 (-4 in two's complement)

        // Bit shifting operations
        //System.out.println(m << 1);  // Left shift: 0011 << 1 = 0110 (6)
        //System.out.println(m << 2);  // Left shift by 2: 0011 << 2 = 1100 (12)
        //System.out.println(l >> 1);  // Signed right shift: 1010 >> 1 = 0101 (5)
        //System.out.println(l >> 2);  // Signed right shift by 2: 1010 >> 2 = 0010 (2)



//----------------------------------------------------------------------------------------------------------


//        6.Unary Operator

//        int h = 3;
//        System.out.println(+h); // Explicit
//        System.out.println(-h); // Negates the value
//        System.out.println(++h); // Increments before use
//        System.out.println(h++); // Increments after use
//        System.out.println(--h); // Decrement before use
//        System.out.println(h--); // Decrement after use



//----------------------------------------------------------------------------------------------------------



//        7.Ternary Operator

//        int j = 70;
//        String result = ( j >= 35) ? "pass" : "fail";
//        System.out.println("Your Result Will be: " +result);


//----------------------------------------------------------------------------------------------------------



    }
}
