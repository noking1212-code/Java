import java.util.*;
public class printing_numbers_from_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
    }
}
