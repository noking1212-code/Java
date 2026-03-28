import java.util.*;
public class assignment {
    public static void main(String args[]){
            // //first question
            // boolean bool = false;
            // int array_num[] = {1,1,1,3,3,4,3,2,4,2};
            // for(int i = 0; i<array_num.length;i++){
            //     for(int j=i+1;j <array_num.length;j++){
            //         if(array_num[i]==array_num[j]){
            //             bool = true;
            //             break;
            //         }
            //         else{
            //             continue;
            //         }
            //     }
            // }
            // System.out.println(bool);
            // //third quesrtion
            // int prices[] = {7,1,5,3,6,4};
            // int bp = prices[0];
            // int profit = 0;
            // for(int i = 0;i<prices.length;i++){
            //     int sp = prices[i];
            //     bp = Math.min(prices[i], bp);
            //     profit = Math.max(sp-bp,profit);
            // } 
            // System.out.println(profit);

            // //fourth question
            // int sum = 0;
            // int height[] = {0,1,0,2,1,0,1,3,2,1,2,1}; 
            // int mrl[] = new int[height.length];
            // int mll[] = new int[height.length];
            // if(height.length <= 2){
            //     System.out.print("0");
            // }
            // else{
            //     mll[0]= height[0];
            //     mrl[height.length -1]= height[height.length-1];
            //     for(int j = height.length-2;j>=0;j--){
            //         mrl[j] = Math.max(mrl[j+1],height[j]);
            //     }
            //     for(int i =1;i<height.length;i++){
            //         mll[i] = Math.max(mll[i-1], height[i]);
            //         int w = Math.min(mrl[i], mll[i]); 
            //         sum += w - height[i];
            //     }

            // }
            // System.out.print(sum);
            //fifth question
            int num[] = {-1,0,1,2,-1,-4};
            int n = num.length;
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    for(int k=0;k<n;k++){
                        if(num[i]!=num[j] && num[j]!=num[k] && num[k]!=num[i] && num[i]+num[j]+num[k]==0){
                            n1 = num[i];
                            n2 = num[j];
                            n3 = num[k];          
                        }
                    }
                }
            }
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);

    }
}
