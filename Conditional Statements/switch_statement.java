import java.util.*;
public class switch_statement {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int Button_number = sc.nextInt();
        switch (Button_number){
            case 1 : System.out.print("horimiya");
                     break;
            case 2 : System.out.print("darling in the franxx");
                     break; 
            case 3 : System.out.print("tokyo revenger");
                     break;            
            case 4 : System.out.print("viral hit");
                     break;            
            case 5 : System.out.print("i want to eat your pancrea");
                     break;            
            case 6 : System.out.print("angle next door");
                     break;            
            case 7 : System.out.print("your lie in april");
                     break;            
            case 8 : System.out.print("your name");
                     break;            
            case 9 : System.out.print("classroom of elite");
                     break;            
            case 10 : System.out.print("erased");
                     break;            
            default : System.out.print("prabh :)");
                     break;
        }
    }
}
