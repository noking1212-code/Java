import java.util.*;
public class print_sum_of_even_And_odd_numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int e_s=0;
        int o_s=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                e_s+=i;
            }
            else{
                o_s+=i;
            }
        }
        System.out.println("even sum:"+e_s);
        System.out.println("odd sum:"+o_s);
    }
}