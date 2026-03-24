public class max_subarray_sum_prefix_sum {
    public static void reverse_arraycc(int array[]){
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[array.length];
        int sum = 0;
        for(int i =0;i<array.length;i++){
            sum += array[i];
            prefix[i]=sum;
            for(int j=i;j<array.length;j++){
                sum+=array[j];
                max = prefix[array.length-i]-prefix[i];
                if(max<sum){
                    max=sum;
                }
            }

        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        int array[] = {1,-2,6,-1,3};
        reverse_arraycc(array);         
    }
}

