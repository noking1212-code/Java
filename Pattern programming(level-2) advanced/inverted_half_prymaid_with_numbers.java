import java.util.Scanner;

public class inverted_half_prymaid_with_numbers {
        public static void pattern(int n){
            for(int i =0;i<=(n-1);i++){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(j);
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
