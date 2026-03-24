public class reverse_array {
    public static void reverse_arraycc(int array[]){
        int n = array.length;
        int r_array[]= new int[n];
        for(int i = n-1;i>=0;i--){
            r_array[n-i-1]=array[i]; 
        }
        for(int j = 0;j < r_array.length ;j++){
            System.out.println(r_array[j]);
        }
    }
    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        reverse_arraycc(array); 
    }
}
