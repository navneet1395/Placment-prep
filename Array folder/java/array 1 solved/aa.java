package Array;

public class aa {

    public static void main(String[] args) {
        int methodarr[] = { 3, 1, 2, 5, 4 };

        // passing array to method m1
        sum(methodarr);

        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;

        // declaring and initializing 2D array
        int multiarr[][] = { { 2, 7, 9 }, { 3, 6, 1 }, { 7, 4, 2 } };

        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(multiarr[i][j] + " ");

            System.out.println();
        }
       

        // cloning array
        int cloneArray[] = arr.clone();

        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(arr == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.println(cloneArray[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void sum(int[] arr) {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }
}
