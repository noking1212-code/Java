import java.util.*;
public class income_tax_cal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income<500000){
            System.out.print("net_income=0");}
        else if(income>500000 && income<1000000){
            float tax = (int)(income*0.2);
            float net_income =income+tax;
            System.out.print("tax = " +tax);
            System.out.print("net_income = " +net_income);} 
        else if(income>1000000){
            int tax = (int)(income*0.3);
            float net_income =income+tax;
            System.out.print("tax = " +tax);
            System.out.print("net-income = " +net_income);} 
    }
}