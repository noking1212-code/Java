public class Maximum_and_minimum_of_an_array_using_minimum_number_of_comparisons {
    public static void main(String args[]){
        int arr[] = {1, 4, 3, 5, 8, 6};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        System.out.println(max);
        System.out.println(min);
    }
}