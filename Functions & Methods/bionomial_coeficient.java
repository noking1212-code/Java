import java.util.*;
public class bionomial_coeficient {
    public static int factoral(int a){
        int product=1;
        for(int i= 1;i<=a;i++){
            product= product*i;
            
        }
    return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int n_Fac = factoral(n);
        int r_Fac = factoral(r);
        int n_r_Fac = factoral(n-r);
        System.out.println(n_Fac/(r_Fac*n_r_Fac));
    }
}
