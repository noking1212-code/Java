import java.util.*;
public class bubble_sorting{
    public static void main(String args[]){
        int num[] = {5,4,1,3,2};
        int n = num.length;
        int count = 0;
        for(int turn = 0; turn <n-1;turn++){
            for(int i= 0;i<n-1-turn;i++){
                int swap=num[i];
                if(num[i]>num[i+1]){
                    num[i] = num[i+1];
                    num[i+1] = swap;
                
                }
                count++;
            }
        }
        for(int i = 0;i<n;i++){
            System.out.println(num[i]);
        }
        System.out.print(count);

    }
}