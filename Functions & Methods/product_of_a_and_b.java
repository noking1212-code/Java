import java.util.*;
public class product_of_a_and_b {
    public static void product(int a, int b){
        System.out.println(a*b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        product(num1, num2);
    }
}
