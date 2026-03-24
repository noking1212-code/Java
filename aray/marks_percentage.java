import java.util.*;
public class marks_percentage {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int marks[] = new int[5];
        int percentage =0;
        for (int i=0;i<=4;i++){
            System.out.print("enter your marks of subject "+i+": ");
            marks[i] = sc.nextInt();
            percentage += marks[i];
        }
        percentage/=3;
        System.out.println("percentage = "+percentage);

        
    }
}
