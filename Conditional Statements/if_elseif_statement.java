import java.util.*;
public class if_elseif_statement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.print("You are Adult!!");
        }
        else if(age>13 && age<18){
            System.out.print("You are Tenager!!");
        }
        else{
            System.out.print("You are kid!!");
        }
    }
}
