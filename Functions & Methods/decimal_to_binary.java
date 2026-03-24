import java.util.*;
public class decimal_to_binary {
    public static int DtB(int n){
        int pow=0;
        int remainder=0;
        int digit=0;
        while(n>0){
            remainder = n%2;
            digit+=remainder*(int)Math.pow(10,pow);
            n/=2;
            pow++;
        }
        System.out.println("The Binary Number is: "+digit);
        return digit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Decimal Number: ");
        int num = sc.nextInt();
        DtB(num);
    }
}
