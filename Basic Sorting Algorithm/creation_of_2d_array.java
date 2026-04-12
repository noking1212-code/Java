import java.util.*;
public class creation_of_2d_array {
    public static void main(String args[]){
        //! creating 2d-array                    ✔
        //! piring 2d-array                      ✔
        //! searching el in 2d-array             ✔
        //! largest and lowest el in 2d-array    
        
        Scanner sc= new Scanner(System.in);
        int m =sc.nextInt();
        int n =sc.nextInt();
        int key =sc.nextInt();
            
        int matrix[][] = new int[n][m];
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key is Found in = "+ i+" "+j);
                }
                else{
                    System.out.println(`"key is not found");
                }
            }
        }
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }   
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                max = Math.max(max, matrix[i][j]);
                min = Math.min(max, matrix[i][j]);
            }
        }
    }
}
