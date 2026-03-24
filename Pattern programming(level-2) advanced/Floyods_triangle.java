import java.util.*;
public class Floyods_triangle {
    public static void pattern(int n){
        int counter=1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 
        pattern(n);
    }
}
