import java.util.*;
public class keep_entering_numbers_till_user_enter_a_multiple_of_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int n=sc.nextInt();;n=sc.nextInt()){
            if(n%10==0){
                break;
            }
        System.err.println(n);
        }
    }
}
