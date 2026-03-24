import java.util.Scanner;

public class rhombus_pattern {
        public static void pattern(int n){
            for(int i =0;i<=n;i++){
                for(int s=1;s<=(n-i);s++){
                    System.out.print(" ");

                }
                for(int j=1;j<=n;j++){
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
