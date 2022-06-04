//Find the minimum and maximum element in an array.

package Array;

public class cq {
    public static void main(String[] args) {
        int min;
        int max;
        int a[] = { 10, 1, 2, 4, 5, 6, 7 };
        if (a[0] > a[1]) {
            min = a[1];
            max = a[0];
        } else {
            max = a[1];
            min = a[0];
        }
        for (int i = 2; i < (a.length); i++) {
            if (a[i] > max) {
                max = a[i];
            } else {
                if (a[i] < min) {
                    min = a[i];
                }
            }
        }
        System.out.println("min:"+min+" max: "+max);

    }

}
