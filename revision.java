public class revision{// Online Java Compiler
// Use this editor to write, compile and run your Java code online


    public static void main(String[] args) {
        int sum =0;
        int array[] ={1,-1,6,-1,3};
        for (int i= 0;i<array.length;i++){
            for(int j = i; j<array.length;j++){
                int s =0;
                System.out.print("(");
                for(int k =i;k<=j;k++){
                    s+= array[k];
                    System.out.print(array[k]+",");
                }
                if(sum< s){
                    sum =s;
                }
                System.out.print(")");

            System.out.println("");
            }
        }
        System.out.println(sum);

    }

    
 }
