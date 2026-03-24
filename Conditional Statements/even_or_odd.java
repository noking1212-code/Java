import java.util.*;
public class even_or_odd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.print(n + " is Even");
        }
        else{
            System.out.print(n + " is odd");
        }
    }
}