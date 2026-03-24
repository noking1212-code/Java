import java.util.*;
public class conditional_statement_assigenment{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //! 1.
        double n = sc.nextInt();
        if (n>=0){
            System.out.print("the number is postive");
        }
        else if(n<0){
            System.out.print("the number is negative");
        }
        //! 2.
        double temp = sc.nextInt();
        if (temp>=100){
            System.out.print("you have fever");
        }
        else if(temp<100){
            System.out.print("you dont have fever");
        }
        //! 3. 
        int day = sc.nextInt();
        switch (day){
            case 1: System.out.print("monday");
                    break;
            case 2: System.out.print("tuesday");
                    break;
            case 3: System.out.print("wednesday");
                    break;
            case 4: System.out.print("thursday");
                    break;
            case 5: System.out.print("friday");
                    break;
            case 6: System.out.print("satrday");
                    break;
            case 7: System.out.print("sunday");
                    break;                    
        }
        //! 4.
        int year = sc.nextInt();
        if (year%4==0) {
            if (year%100==0) {
                if (year%400==0) {
                    System.out.print("a lear year");            
                }
                else{
                    System.out.print("not a lear year");
                }    
            }
            else{
                System.out.print("a lear year");
            }        
        }
        else{
            System.out.print("not a lear year");
        }
    }
}