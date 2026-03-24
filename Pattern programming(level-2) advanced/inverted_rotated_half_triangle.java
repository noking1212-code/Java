import java.util.Scanner;

public class inverted_rotated_half_triangle{
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=(n-i);s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int n = sc.nextInt(); 
        pattern(n);
    }
}
