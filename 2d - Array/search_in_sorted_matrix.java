public class search_in_sorted_matrix {
    public static void main(String args[]){
        int array[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        //!brute force
        // for(int i=0;i<array.length;i++){
        //     for(int j=0;j<array[0].length;j++){
        //         if(key==array[i][j]){
        //             System.out.println(i+" "+j);
        //         }
        //     }
        // }
        //!staircase search
        int i= 0;
        int j= array[0].length-1;
        int curent = array[i][j];
        while(curent != key){
            if(curent<key){
                j--;
                curent = array[i][j]
            }
            else if(curent>key){
                i++;
                curent = array[i][j]
        }
        System.out.print(i+" "+j)
    }
}
