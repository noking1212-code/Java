import java.util.*;
public class reverse_of_a_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int n=sc.nextInt();n>0;n=n/10){
            int r_d = 0;
            int l_d = n%10;
            int rev= (r_d*10)+l_d;
            System.err.print(rev);
        }
    }
}