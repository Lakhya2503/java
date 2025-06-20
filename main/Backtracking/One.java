    package Backtracking;

    public class One {
        public static void printPermi(String str , String perm, int indx) {
            if (str.length() == 0) {
                System.out.println("perm:  "+perm);
                return;
            }
            for (int i = 0; i < str.length(); i ++) {
                char currentCharacter = str.charAt(i);
                String newStr = str.substring(0 , i) + str.substring(i + 1);

/*
                System.out.println("str.charAt(i): "+str.charAt(i));
                System.out.println("str.substring(0 , i): " + str.substring(0 , i));
                System.out.println("str.substring(i + 1): " +str.substring(i + 1));
                System.out.println("newStr: " + newStr);
 */

                printPermi(newStr,  perm + currentCharacter, indx +1);
            }
        }

        public static void main(String[] args) {
            String str = "ABC";
            printPermi(str, "", 0);

        }
    }
