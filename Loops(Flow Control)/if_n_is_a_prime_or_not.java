import java.util.*;
public class if_n_is_a_prime_or_not{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime=false;
        for(int i =2;i<=n-1;i++){
            for(int j =n-1;j>=2;j--){
                if(i*j==n){
                    isprime=true;
                    break;                    
                }
                else{
                    continue;
                    
                }
            }
        }
        System.err.println(isprime);
    }
}