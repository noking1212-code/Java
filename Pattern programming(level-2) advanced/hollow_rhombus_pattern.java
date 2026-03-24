import java.util.Scanner;

public class hollow_rhombus_pattern {
        public static void pattern(int n){
            for(int i =1;i<=n;i++){
                for(int s=1;s<=(n-i);s++){
                    System.out.print(" ");

                }
                for(int j=1;j<=n;j++){
                    if(j==1||j==n||i==1||i==n)
                        {System.out.print("*");
                    }
                    else{
                        System.out.print(" ");

                    }
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
