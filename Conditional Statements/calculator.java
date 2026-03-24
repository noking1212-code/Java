import java.util.*;
public class calculator{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String operator = sc.next();
        switch(operator){
            case "+" : System.out.print(a+b);
                        break;
            case "-" : System.out.print(a-b);
                        break;
            case "/" : System.out.print(a/b);
                        break;
            case "*" : System.out.print(a*b);
                        break;
            case "%" : System.out.print(a%b);
                        break;                 
        }
    }
}