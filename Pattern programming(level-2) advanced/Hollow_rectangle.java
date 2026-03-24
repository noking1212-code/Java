import java.util.*;
public class Hollow_rectangle {
    public static void pattern(int n, int m){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            
            
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt(); 
        System.out.print("Enter column: ");
        int column = sc.nextInt();
        pattern(row,column);
    }
}
