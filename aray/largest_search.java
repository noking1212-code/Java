public class largest_search {
    public static int largest_search(int array[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>=largest){
                largest=array[i];
            }
        }
        System.out.print("larest number among them is: "+largest);
        return largest;
    }
    public static void main(String args[]){
        int array[] = {2,3,4,524,2,31,10,20};
        largest_search(array);
    }
}