public class Max_subbarray {
    public static void main(String args[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4} ;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i;j<arr.length;j++){
                int temp_sum=0;
                for(int k =i;k<j+1;k++){
                    temp_sum+=arr[k];
                }
                sum = Math.max(sum,temp_sum);
            } 
        }
        System.out.println(sum);
    }    
}
