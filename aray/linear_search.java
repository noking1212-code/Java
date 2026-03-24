public class linear_search {
    public static int linear1_search(int array[],int key){
        int indexe =0;
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                System.out.print("the number is in index: "+i);
                indexe=1;
            }
            else{
                System.out.print("the number is not found");
                indexe=-1;
            }
        }
        return indexe;
    }
    public static void main(String args[]){
        int array[] = {2,3,4,524,2,31,10,20};
        int key=10;
        linear1_search(array,key);
    }
}