import java.util.*;
public class sum_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        int sum=0;
        while(counter<=n){
            System.out.println(counter);
            sum+=counter;
            counter++;
        }
        System.out.println(sum);
    }
}
