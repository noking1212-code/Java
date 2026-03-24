public class subbaraay {
    public static void reverse_arraycc(int array[]){
        int ts =0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        for(int i = 0;i<array.length;i++){
            
            for(int j = i;j<array.length;j++){
                int sum=0;
                System.out.print("(");
                for(int k=i; k<=j;k++){
                    System.out.print(array[k]+",");
                    sum+=array[k];
                }
                ts++;
                System.out.print(")");
                if(sum>max){
                    max=sum;
                }
                if(sum<min){
                    min=sum;
                }
            }
            System.out.println();
            
        }
        System.out.println(ts);
        System.out.println(min);
        System.out.println(max);

    }

    public static void main(String args[]){
        int array[] = {1,-2,6,-1,3};
        reverse_arraycc(array); 
    }
}
