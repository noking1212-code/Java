public class paladrom_number{
    public static void main(String args[]){
        String name = "madam";
        boolean isPaladrom = true;
        for(int i =0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-i-1)){
                isPaladrom = false;
                break;
            }
        }
        System.out.println("ispaladrom");
        
    }
}