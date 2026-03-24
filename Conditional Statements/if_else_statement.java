import java.util.*;
public class if_else_statement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.print("You Can Drive!!");
        }
        else{
            System.out.print("You Can't Drive!!");
        }
    }
}
