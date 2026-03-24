import java.util.*;
public class practise_sheet{
    public static int average(int a,int b, int c){
        int average= (a+b+c)/3 ;
        System.out.print(average);
        return average;
    }

    public static void isEven(int a){
        if(a%2==0){
            System.out.print(true);
        }
        else{
            System.out.print(false);

        }
    }

    public static int palindrome(int n){
        int lsd = 0;
        int orignal=n;
        int number= 0;
        while (n>0){
            lsd = n%10;
            number=number*10+lsd;
            n/=10;
        }
        if (orignal==number){
            System.out.print("True");
        }
        else{
            System.out.print("False");
            

        }
        return lsd;
    }

    public static int sum_of_digits(int a){
        int sum=0;
        while (a>0){
            sum+=a%10;
            a/=10;    
        }
        System.out.println(sum);
        return sum;
    }

    public static void  main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter First number: ");
        // int num1 = sc.nextInt();
        // System.out.print("Enter Second number: ");
        // int num2 = sc.nextInt();
        // System.out.print("Enter Third number: ");
        // int num3 = sc.nextInt();
        // average(num1,num2,num3);

        // System.out.print("Enter A Number: ");
        // int num = sc.nextInt();
        // isEven(num);

        // System.out.print("Enter A Number: ");
        // int num = sc.nextInt();
        // palindrome(num);

        System.out.print("Enter A Number: ");
        int num = sc.nextInt();
        sum_of_digits(num);
    }
}