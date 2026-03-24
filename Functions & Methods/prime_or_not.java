import java.util.*;
public class prime_or_not{
    public static boolean PRIME_OR_NOT(int a){
        boolean result = true;
        if(a == 2){
            return true;
        }
        
        else{
            for(int i = a-1;i>=2;i--){
            if (a%i==0){
                result = false;
            }
        
        }
        return result;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.print("Is "+num+" Prime Number or Not: "+PRIME_OR_NOT(num));
    }

}