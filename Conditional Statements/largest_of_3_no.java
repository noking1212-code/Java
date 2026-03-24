import java.util.*;
public class largest_of_3_no{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.print(a+" is bigger");}
        else if(b>a && b>c){
            System.out.print(b+" is bigger");} 
        else if(c>a && c>b){
            System.out.print(c+" is bigger");} 
        else{
            System.out.print("no on eis bigger");}
    }
}