import java.util.*;
public class selection_sorting {
    public static void main(String args[]) {
        int num[] = {5,4,1,3,2};
        int n = num.length;
        for(int i =0;i<n-1;i++){
            int minposs = i;
            for(int j= i+1; j<n;j++){
                if(num[minposs]>num[j]){
                    minposs = j;
                }
            }
            int swap = num[minposs];
            num[minposs] = num[i];
            num[i] =swap;
        }
        for(int i = 0;i<n;i++){
            System.out.print(num[i]);
        }
    }
}
