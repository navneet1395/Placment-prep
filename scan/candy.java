package scan;


    import java.util.*;


public class candy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int m = sc.nextInt();
            int c[]= new int [n];
            int i =0,sum =0;
            while(i<n){
                c[i]= sc.nextInt();
                sum= sum+c[i];
                i++;
            }
            System.out.println(sum%m);
        }
    }
}

