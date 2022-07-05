package practice;
import java.util.Scanner;

public class Prime {
    boolean prime(int n){
        if(n==1){
            return false;
        }
        if(n==2  && n==3){
            return true;
        }
        if(n%2==0 && n%3==0){
            return false;
        }
        for(int i =5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Prime sll = new Prime();
        System.out.println(sll.prime(n));
        

    }
}
