public class Arrays {
        public static void main (String [] args){
//            int [] arr1 = new int[15];
//            arr1[2] = 20;
//            arr1[5] = 50;
//            for (int i = 0; i < arr1.length ; i++) {
//                    System.out.println(arr1[i]);
//            }

//            int [] arr2 = {2,5,8,7,9,10};

//            for (int i = 0; i < arr2.length; i++) {
//                System.out.println(arr2[i]);
//            }

//            for (int i : arr2) {
//                System.out.println(i);
//            }

//            System.out.println(arr2); // output will be the hash code value

//----------------------------------------------------------------------
//    2D ARRAY
//
//            int [][] arr = {
//                    { 1, 2, 3 },
//                    { 4, 5, 6 },
//                    { 7, 8, 9 },
//            };
//
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr.length; j ++) {
//                        System.out.print(arr[i][j] + "  ");
//                }
//                System.out.println();
//            }

//----------------------------------------------------------------------
//    Jagged ARRAY

            int [][] arr = {
                    { 1, 2, 3 },
                    { 4, 5, 6, 2 },
                    { 7, 8, 9 },
            };

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }


        }
}

