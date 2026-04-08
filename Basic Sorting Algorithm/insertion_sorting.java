public class insertion_sorting {
    public static void main(String args[]){
        int array[] = {4,1,5,2,3};
        for(int i=1;i<array.length;i++){
            int key = array[i];
            int j = i-1;
            while(j>=0 && array[j]>key){
                array[i] = array[i-1];
                j--; 
            }
            array[j+1] = array[i]; 
        }
    }
}
