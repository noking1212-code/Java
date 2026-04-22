public class reverse_the_array{
    public static void main(String args[]){
        int arr[] = {1, 4, 3, 2, 6, 5};
        int rev[] = new int[arr.length];
        for(int i= 0;i<arr.length;i++){
            rev[i] = arr[arr.length-i-1];
        }
        for(int i= 0;i<arr.length;i++){
            System.out.print(rev[i]+" ");
        }
    }
}