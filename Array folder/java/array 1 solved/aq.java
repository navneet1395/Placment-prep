package Array;

import java.util.Scanner;

//Create an Array of size 10 of integers. Take input from the user for these 10 elements and print the entire array after that.

public class aq {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("input the no. at index"+i);
            arr[i]=scanner.nextInt();

        }
        System.out.println("array u inputed");
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
 