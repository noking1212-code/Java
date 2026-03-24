import java.util.*;
public class pass_or_fail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String present = (marks>=33)? "pass":"fail";
        System.out.print(present);
    }
}
