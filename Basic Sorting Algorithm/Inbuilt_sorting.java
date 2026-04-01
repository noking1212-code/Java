import java.util.*;
public class Inbuilt_sorting {
    public static void main(String args[]){
        Integer array[] = {5,6,4,3,2,1};€
        Arrays.sort(array);
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]);
        }
            System.out.println();

        Integer array1[] = {5,6,4,3,7,2,1};
        Arrays.sort(array1,1,4);
        for(int i = 0;i<array1.length;i++){
            System.out.print(array1[i]);
        
        Integer array2[] = {5,6,4,3,2,1};        
        Arrays.sort(array2,Collections.reverseOrder());
        
        Integer array3[] = {5,6,4,3,2,1};        
        Arrays.sort(array3,1,4,Collections.reverseOrder());        }
    }
};