import java.util.*;
public class largest_of_2_numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.print(a +" is Greater than " + b);
        }
        else{
            System.out.print(b +" is Greater than " + a);
        }
    }
}