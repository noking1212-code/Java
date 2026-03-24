import java.util.*;
public class binary_to_decimal {
    public static int BtD(int a){
        int pow =0;
        int sum =0;
        int lastDigti = 0;
        while (a>0){
            lastDigti=a%10;
            int mp=(int)Math.pow(2,pow);
            sum+=(lastDigti*mp);
            a/=10;
            pow++;
        }
        System.out.println("The Decimal Number is: "+sum);
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Binary Number: ");
        int num = sc.nextInt();
        BtD(num);
    }
}
