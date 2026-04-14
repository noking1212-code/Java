public class spiral_matrix {
 public static void main(String args[]) {
    int array[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
    int startrow = 0;
    int endrow = array.length-1;
    int startcol = 0;
    int endcol = array[0].length-1;
    while(startcol<=endcol && startrow<=endrow){
        for(int i=startrow;i<=endrow;i++){
            System.out.print(array[startrow][j]);
        }
        for(int j=startrow+1;j<=endrow;j++){
            System.out.print(array[j][endrow]);
        }
        for(int k=endrow-1;j>=startrow;j--){
            System.out.print(array[endrow][k]);
        }
        
        for(int j=endrow;j>=startrow;j--){
            System.out.print(array[j][endrow]);
        }
    }
}   
}
