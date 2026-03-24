import java.util.*;
public class print_factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        double factorial=1;
        for(double i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.print("factorial: "+factorial);

    }
}
