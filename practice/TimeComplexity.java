package practice;
public class TimeComplexity {

    public static void main(String[] args) {
        double now =System.currentTimeMillis();
        TimeComplexity demo =new TimeComplexity();
        System.out.println(demo.findsum(99999));

        System.out.println("time Taken ="+(System.currentTimeMillis()-now)+"millisec.");
    }
     public int findsum(int n){
        //  return (n*(n+1)) /2;
         
         int sum=0;
         for (int i=0;i<=n;i++){
             sum=sum+i;
         }
         return sum;
     }   
    }
    //time complexity is first is O(1)
    // in  second is O(n)
    //Space complexity in first id theta(1)
    //in second theta (n)  

