/*Check whether n is present in an array of size m or not.
Input - n,m (Input number, size of array)
- Take input n elements for the array
Output -> true/false */

package Array;

import java.util.Scanner;

public class bq {

    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        System.out.print("integer to be searched:");

        int n = scaner.nextInt();

        int arr[] = {3,2,53,25,214,56,242,56,21};

        for( int i=0;i<arr.length;i++){
            if ( arr[i] == n){
                System.out.println("True");
            }
            }
            
        }

        

    }


