package sorting;

class SelectionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {7,8,9,2,4,3,1};

        for (int i = 0; i < arr.length; i++) {
            int smallets = i;
            for( int j = i +1; j < arr.length; j++) {
                if (arr[smallets] > arr [j]) {
                    smallets = j;
                }
            }

            int temp = arr[smallets];
            arr[smallets] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);

    }
}
