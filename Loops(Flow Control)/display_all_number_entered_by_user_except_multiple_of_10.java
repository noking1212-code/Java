import java.util.*;
public class display_all_number_entered_by_user_except_multiple_of_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int n=sc.nextInt();;n=sc.nextInt()){
            if(n%10==0){
                continue;
            }
        System.err.println(n);
        }
    }
}
