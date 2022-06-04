
//Write a program to sort the given array.
//Find the Kth largest and Kth smallest number in an array.
//Given an number n. Find the number of occurrences of n in the array.
//Find the range of the array. Range means the difference between the maximum and minimum element in the array.

package Array;

import java.io.*;
import java.util.Scanner;

public class ea 
{
    void mySort(int m, int a[]) {
        int p;
        m = a.length;
        for (int z = 0; z < m-1; z++) { // when we use z+1 z is less tha m-1 and i is upto m
            for (int i = 0; i < m - z - 1; i++) {
                if (a[i] > a[i + 1]) {
                    // if i use z+1 instead of i+1 i got the same value
                    p = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = p;
                }
            }

        }
    }

    void bubbleSort(int n, int arr[]) {
        n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    void printArray(int m, int a[]) {
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }

    void range(int a[]) {
        int m = a.length;
        System.out.println("Range is :" + (a[m - 1] - a[0]));
    }

    void findNumber(int a[], int t, int p) { // t is the largest and p is the smallest
        int m = a.length;
        if (t <= m) {
            System.out.println(t + "th largest No. in array" + a[m - t]);
        } else {
            System.out.println("your values are larger than array index");
        }
        if (p <= m) {
            System.out.println(p + "th smallest No. in array" + a[p - 1]);
        } else {
            System.out.println("your values are larger than array index");
        }

    }

    void occurence(int a[], int o) {
        int m = a.length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (a[i] == o) {
                count++;
            }
        }
        System.out.println("Occurence of " + o + "are " + count);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a1[] = { -1,-3,3,47,27,914,3,245,5,3,56,5433,65,3,45,4,5,78889,35,644,3,35,6443,4,654,35,-1,-3,3,47,27,914,3,245,5,3,56,5433,65,3,45,4,5,78889,35,644,3,35,6443,4,654,35,-1,-3,3,47,27,914,3,245,5,3,56,5433,65,3,45,4,5,78889,35,644,3,35,6443,4,654,35};
        int a2[] = { -1,-3,3,47,27,914,3,245,5,3,56,5433,65,3,45,4,5,78889,35,644,3,35,6443,4,654,35,-1,-3,3,47,27,914,3,245,5,3,56,5433,65,3,45,4,5,78889,35,644,3,35,6443,4,654,35,-1,-3,3,47,27,914,3,245,5,3,56,5433,65,3,45,4,5,78889,35,644,3,35,6443,4,654,35};

        int m = a1.length;

        ea ob = new ea();

        long mySortStart = System.nanoTime();
        ob.mySort(m, a1);
        long mySortEnd = System.nanoTime();

        long mySortTime = mySortEnd - mySortStart;

        long bubbleSortStart = System.nanoTime();
        ob.bubbleSort(m, a2);
        long bubbleSortEnd = System.nanoTime();

        long bubbleSortTime = bubbleSortEnd - bubbleSortStart;

        System.out.println("\nmySortTime: " + mySortTime + "\nbubbleSortTime: " + bubbleSortTime);

        // System.out.println("my Sort algo array");
        // ob.printArray(m, a);
        // System.out.println("bubble Sort algo array");
        // ob.printArray(m, a);
        // System.out.println("Range of array");
        // ob.range(a);

        // System.out.println("enter the no. whose occurence u want to check :");
        // int o = scan.nextInt();
        // ob.occurence(a, o);
        // System.out.println("find kth largest and smallest no.");
        // System.out.println("find kth largest no.: ");
        // int t = scan.nextInt();
        // System.out.println("find kth smallest no.: ");
        // int p =scan.nextInt();
        // ob.findNumber(a, t, p);

    }
}
