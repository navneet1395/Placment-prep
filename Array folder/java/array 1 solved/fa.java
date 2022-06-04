package Array;
//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm.

/*
 * Switch statment learning
 *  It is like an if-else-if ladder statement. 
 * It provides an easy way to dispatch execution to different parts of code based on the "value of the expression".
 * Syntax: Switch-case 

// switch statement 
switch(expression)
{
   // case statements
   // values must be of same type of expression
   case value1 :
      // Statements
      break; // break is optional
   
   case value2 :
      // Statements
      break; // break is optional
   
   // We can have any number of case statements
   // below is default statement, used when none of the cases is true. 
   // No break is needed in the default case.
   default : 
      // Statements
} 
 */

public class fa {
    public static void main(String[] args) {
        int a[] = { 0, 0, 2, 1, 2, 1, 1, 0, 0, 2, 1, 2 };
        int m = a.length;
        int count0 = 0;
        int count2 = 0, count1 = 0;
        for (int i = 0; i < m; i++) {
            switch (a[i]) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 0:
                    count0++;
                    break;
            }}

            // while statment dont need the gor loops as it is going to run infinty upto a sitution get false
            int z=0;
            while (count0>0) {
                a[z++] = 0;
                count0--;
            }
            while (count1>0) {
                a[z++] = 1;
                count1--;
            }
            while (count2>0) {
                a[z++] = 2;
                count2--;
            }

        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
