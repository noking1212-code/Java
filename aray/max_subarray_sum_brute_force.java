public class max_subarray_sum_brute_force {
    public static void reverse_arraycc(int array[]){
        int max=Integer.MIN_VALUE;
        for(int i =0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                int sum = 0;
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    System.out.print(array[k]+",");
                    sum += array[k];
                }
                System.out.print(")");
                if(max<sum){
                    max=sum;
                }
            }
            System.out.println();
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        int array[] = {1,-2,6,-1,3};
        reverse_arraycc(array);         
    }
}

