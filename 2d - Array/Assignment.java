import java.util.*;
public class Assignment {
    public static void main(String args[]) {
        //!first question
        // int array[][] = {{4,7,8},{8,8,7}};
        // int count=0;
        // for(int i=0;i<array.length;i++){
        //     for(int j =0;j<array[0].length;j++){
        //         if(array[i][j]==7){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);

        //!second question
        // int[][] array =  {{1,4,9},{11,4,3},{2,2,3}};
        // int s=0;
        // for(int i =0;i<array[0].length;i++){
        //     s+= array[1][i];
        // }
        // System.out.println(s);

        //!third question
        String[][] matrix = {{"a11","a12","a13"},{"a21","a22","a23"}};
        String[][] transpossed_matrix = new String[matrix[0].length][matrix.length];
        for(int i=0;i<transpossed_matrix[0].length;i++){
            for(int j=0;j<transpossed_matrix.length;j++){
                transpossed_matrix[j][i] = matrix[i][j]; 
        }    
        }
        for(int i=0;i<transpossed_matrix.length;i++){
            for(int j=0;j<transpossed_matrix[0].length;j++){
                System.out.print(transpossed_matrix[i][j]+" ");
            }
            System.out.println();
        }
     }
}
