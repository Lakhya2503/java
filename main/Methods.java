public class Methods {
        public static void main (String [] args)  {
//            int [] arrays = {1,2,8,8,6,4};
//            SumOfArray(arrays);
//
//            int a = SumOfArray2(arrays);
//            System.out.println("The Sum of Array is : " +a);
//            Cat a = new Cat();
//            a.name = "bagadBilla";
//            Cat cat = uppercaseFun(a);
//            System.out.println(cat.name);
//            System.out.println(a.name);


            System.out.println(SumOfNumbers(1,2,3,4,5));

        }


        public static int SumOfNumbers(int ...a) {
                int sum = 0;
                for (int i : a ) {
                    sum += i ;
                }
                return  sum;
        }


//    public  static Cat uppercaseFun(Cat cat) {
//                cat.name = cat.name.toUppercase();
//                return  cat;
//            }




//        public static void SumOfArray (int[] arr) {
//            int [] arrs = arr;
//            int sum = 0 ;
//            for (int i: arr) {
//                sum += i;
//            }
//            System.out.println("The Sum of Array is : " + sum);
//        }
//
//        public static int SumOfArray2(int[] b) {
//            int [] a = b;
//            int sum = 0 ;
//            for (int i: a) {
//                sum += i;
//            }
//            return  sum;
//        }

}
