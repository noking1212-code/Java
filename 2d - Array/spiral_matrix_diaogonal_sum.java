public class spiral_matrix_diaogonal_sum {
    public static void main(String args[]){
        int array[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
        int startrow = 0;
        int endrow = array.length-1;
        int startcol = 0;
        int endcol = array[0].length-1;
        int s = 0;
        while(startcol <= endcol && startrow <= endrow){
            s += array[startrow][startcol] +array[endrow-startrow][endcol-startcol];
            
            startrow++;
            startcol++;
        }
        System.out.println(s);
    }
}
