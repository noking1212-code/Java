//*practise question 1.
// import java.util.*;
// public class VARIABLES_And_DATATYPES_QUESTIONS{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(); 
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int sum = a+b+c;
//         double average = sum/3.0;
//         System.out.print(average);
//     }
// }
//*practise question 2.
// import java.util.*;
// public class VARIABLES_And_DATATYPES_QUESTIONS{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int side = sc.nextInt();
//         int area = side*side;
//         System.out.print(area);
//     }
// }
//*practise question 3.
import java.util.*;
public class VARIABLES_And_DATATYPES_QUESTIONS{
    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        float pencil_cost = sc.nextFloat();
        float pen_cost = sc.nextFloat();
        float eraser_cost = sc.nextFloat();
        float bill = pencil_cost + pen_cost + eraser_cost;
        float Gst = (bill*18.0f)/100.0f;
        float final_bill = Gst + bill;
        System.out.print(final_bill);
    }
}

