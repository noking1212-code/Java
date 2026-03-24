import java.util.*;
public class priting_aray {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int marks[] = new int[5];
        for (int i=0;i<=4;i++){
            marks[i] = sc.nextInt();
            System.out.println("marks["+i+"] is "+marks[i]);
        }
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
