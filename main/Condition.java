import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//----------------------------------------------------------------------------------------------

        // if else-if else

//-------------------------------------   markshit ex. ------------------------------------------

//        System.out.print("Enter Your Marks (10 to 100): ");
//        String gradeA = "Excellent";
//        String gradeB = "Very Good";
//        String gradeC = "Good";
//        String gradeD = "Pass";
//        String gradeE = "Fail";

//        int marks =  sc.nextInt();
//        if (marks <= 100 && marks >= 90) {
//            System.out.println(gradeA);
//        } else if (marks <= 89 && marks >= 80){
//            System.out.println(gradeB);
//        } else if (marks <= 79 && marks >= 60){
//            System.out.println(gradeC);
//        }else if (marks <= 59 && marks >= 35){
//            System.out.println(gradeD);
//        }else {
//            System.out.println(gradeE);
//        }


//----------------------------------------------------------------------------------------------

        //if else-if if else (nested)

//-------------------------------------   shopping cart ex. ------------------------------------------

        // price Tag
        //prefers to card not to cash
//        boolean card = true;
//        boolean cash = false;
//        int carrot = 20;
//        int cilly = 10;
//        int pineapple = 110;

//         System.out.print("What do You won't, Sir..? (cilly🌶️, carrot🥕, pineapple🍍): ");
//        String shoppingBag = sc.nextLine().toLowerCase();

//        if(shoppingBag.equals("carrot")|| shoppingBag.equals("cilly")||shoppingBag.equals("pineapple")) {

//            int price = shoppingBag.equals("carrot") ? carrot :
//                         shoppingBag.equals("cilly") ? carrot :
//                         pineapple;


//                System.out.print("How to pay the bill sir..? (cash 💰  or card 💳): ");
//                String cashOrCard = sc.nextLine().toLowerCase();

//                if (cashOrCard.equals("card")){
//                    System.out.println("you'll pay for "+ shoppingBag + "  Rs. " + price + "/-");
//                } else {
//                    System.out.println("sorry don't except the cash 💰 payment..!");
//                }

//        } else  {
//            System.out.println("sorry don't have any type of product that you choose better luck time....!");
//        }
//
//            System.out.println("Thanx for visit please visit next time also....👍✌️");


//----------------------------------------------------------------------------------------------

        //Switch

//-------------------------------------  Number on Months ex. ------------------------------------------

        System.out.print("what the month (choose 1 to 12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("Jun");
                break;

            case 7 :
                System.out.println("July");
                break;

            case 8 :
                System.out.println("August");
                break;

            case 9 :
                System.out.println("September");
                break;

            case 10 :
                System.out.println("October");
                break;

            case 11 :
                System.out.println("November");
                break;

            case 12 :
                System.out.println("December");
                break;

            default:
                System.out.println("Sorry Wrong Input Please choose in 1 to 12 ...");
        }



    }
}

