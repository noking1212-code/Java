import java.util.*;
public class counting_sorting {
    public static void main(String args[]){
        int array1[] = {1,4,1,3,2,4,3,7};
        int range = Integer.MIN_VALUE;
        for(int i=0;i<array1.length;i++){
            range = Math.max(range, array1[i]); 
        }
        int count[] = new int[range+1];
        for(int i =0; i<array1.length;i++){
            count[array1[i]]++;
        }

        int j =0;
        for(int i =0; i<count.length;i++){
            while(count[i]>0){
                array1[j] = i;
                j++;
                count[i]--;

            }
        }
        for(int i = 0;i<array1.length;i++){
            System.out.print(array1[i]);
        }
    }
}
