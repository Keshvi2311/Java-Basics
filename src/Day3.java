
import java.util.Arrays;

public class Day3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int result = calculateSum(x, y);

        System.out.println("x = " + x);
        System.out.println("result = " + result);

        int[] a = {4,9,10,999,56,23,6};
        int[] b = new int[a.length];
        int sum = 0;
        int max = a[0];
        int count = 0;

        for(int i = 0;i<a.length;i++){
            b[i] = a[i];
        }

        int[] o = {10, 20, 30};
        int[] m = o.clone();



        int[] l = {10, 20, 30};
        int[] n = Arrays.copyOf(l, l.length);

        System.out.println(m);

        for (int i = 1 ; i<a.length ; i++){
            System.out.println(a[i]);
            sum = a[i] + sum;
            if (a[i]>max){
                max = a[i];
            }
            if (a[i] % 2 == 0){
                count ++;
            }
        }
        System.out.println("Count  = " +count);

        for (int i = a.length-1 ; i>=0 ; i--){
            System.out.println(a[i]);
        }

        System.out.println(sum);
        System.out.println(max);

        System.out.println(max+2);
        System.out.println(sum+6);

    }

    public static int calculateSum(int a, int b) {
        a = 100;
        return a + b;
    }
}
