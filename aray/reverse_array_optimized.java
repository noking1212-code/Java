public class reverse_array_optimized {
    public static void reverse_arraycc(int array[]){
        for(int i=0;i<(array.length)/2;i++){
            int copy=array[i];
            array[i] = array[array.length-i-1];
            array[array.length-1-i]= copy;
        }
        for(int i= 0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        reverse_arraycc(array); 
    }
}
