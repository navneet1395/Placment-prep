package Array;
//Write a program to reverse the array.

public class dq{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int rarr[]= new int[arr.length];
        for(int i=0; i<arr.length;i++){
            int m =arr.length-1;
            rarr[m-i]=arr[i];

            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(rarr[i]+" ");
        }

    }
}