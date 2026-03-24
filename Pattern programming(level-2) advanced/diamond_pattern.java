import java.util.Scanner;

public class diamond_pattern {
        public static void pattern(int n){
            for(int i =1;i<=n;i++){
                for(int s =1;s<=(n-i);s++){
                    System.out.print(" ");
                }
                for(int j=1;j<=((i*2)-1);j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i =n;i>=1;i--){
                for(int s =(n-i);s>=1;s--){
                    System.out.print(" ");
                }
                for(int j=((i*2)-1);j>=1;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
        pattern(n);
    }
}
