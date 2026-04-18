public class finding_shortest_path{
    public static void main(String args[]){
        String route = "WNEENESENNN";
        int x=0;
        int y=0;
        int tSP =0;
        double SP =0;
        for(int i=0;i<route.length();i++){
            if(route.charAt(i) == 'W' || route.charAt(i) == 'w'){
               x--; 
            }
            if(route.charAt(i) == 'E' || route.charAt(i) == 'e'){
               x++; 
            }
            if(route.charAt(i) == 'S' || route.charAt(i) == 's'){
               y--; 
            }
            if(route.charAt(i) == 'N' || route.charAt(i) == 'n'){
               y++; 
            }
        }
        tSP=x*x + y*y;
        SP = Math.sqrt(tSP);
        System.out.print(SP);
    }
}