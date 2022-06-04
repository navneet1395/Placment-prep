//Move all the negative elements to one side of the array.

package Array;

import java.util.Scanner;

public class ga {
    void rearrange(int a[],int n){
        int count = 0,temp;
            for (int i = 0; i < n; i++) {
                
                if (a[i] < 0) {
                    if (count != i) {
                      temp=a[i]  ;
                      a[i]=a[count];
                      a[count]=temp;
    
                    }
                    count++;
                }
                
            }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("array length: ");
        int n = scan.nextInt();
        int a[]=new int[n];
        System.out.println("insert array no.: ");
        for(int i=0;i<n;i++){
            System.out.print(i+": ");
            a[i] = scan.nextInt();
        }
        ga op = new ga();
        System.out.println("unsorted array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        op.rearrange(a,n);
        // int a[] = { -3, 3, -2, 6 - 4, 5, 5, 3, -3, -5, -7 };
        System.out.println("sorted array");
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        

    }
}