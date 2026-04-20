public class string_funtction_compare{
    public static void main(String args[]){
        String s1 = "prabh";
        String s2 = "prabh";
        String s3 = new String("prabh");
        
        if(s1 ==s2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        //here it will return true;
        if(s1 ==s3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        //here it will return false
        //because these two objects are different. s1 and s2 are same.....but s3 is a new string which is a diff string
        if(s1.equals(s3)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}