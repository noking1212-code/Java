import java.util.*;
public class print_all_prime_numbers_in_a_range{
    public static boolean prime(int a){
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 2;i<=num;i++){
        System.out.println("Is "+i+" Prime Number or Not: "+prime(i));
        }
    }
}