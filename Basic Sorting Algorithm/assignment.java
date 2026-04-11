import java.util.*;
public class assignment {
    public static void main(String args[]){
        int list[] = {5,4,1,3,2};
        int n = list.length;
        //!bubble sort
        // for(int i =0;i<n-1;i++){
        //     for(int j =0;j<n-i-1;j++){
        //         int swap =0; 
        //         if(list[j]>list[j+1]){
        //             swap = list[j];
        //             list[j] = list[j+1];
        //             list[j+1] = swap;
        //         }
        //     }
        
        // }

        //!selection sort
        // for(int i=0;i<n-1;i++){
        //     int minpos =i;
        //     for(int j=i+1;j<n;j++){
        //         if(list[minpos]<list[j]){
        //             int swap = list[j];
        //             list[j]=list[minpos];
        //             list[minpos] = swap;
        //             minpos = j;
        //         }
        //     }
        // }

        //!counting sorting
        int range = 0;
        for(int i =0;i<list.length;i++){
            range = Math.max(range, list[i]);
        }

        int count[] = new int[range+1];
        for(int i =0;i<count.length;i++){
            count[list[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                list[j]=i;
                j++;
                count[i]--;
            }
        }


        for(int i=0;i<n;i++){
            System.out.println(list[i]+" ");
        }
    }
}
