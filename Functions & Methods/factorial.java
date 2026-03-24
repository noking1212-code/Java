import java.util.*;
public class factorial {
    public static int factoral(int a){
        int product=1;
        for(int i= 1;i<=a;i++){
            product= product*i;
        }
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factoral(num));

    }
}
