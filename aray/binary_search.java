
public class binary_search {
    public static void binary_search(int array[],int key){
        int n = array.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if (key < array[mid]){
                end=mid-1;
            }
            else if(key>array[mid]){
                start = mid+1;
            }
            else if(key == array[mid]){
                System.out.println("found ");
                break;
            }
        }
    }
    public static void main(String args[]){
        int array[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 10;
        binary_search(array,key);
   }
}
