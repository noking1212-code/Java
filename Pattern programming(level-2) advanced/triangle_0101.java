import java.util.*;
public class triangle_0101{
    public static void pattern(int n){
        int counter=1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(counter%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");

                }
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
