import java.util.*;
public class Chocolate_Distribution_Problem {
    public static void main(String[] args) {
        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m =3;
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);   
        for(int i=0;i<arr.length-m;i++){
            int diff = arr[m+i-1] - arr[i];
            min =  Math.min(min, diff);
        }
        System.out.print(min);
    }
}
