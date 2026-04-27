public class String_bulder{
    public static void main(String args[]){
        StringBuilder str1 = new StringBuilder("");
        for(char i = 'a';i<='z';i++){
            str1.append(i);
        }
        System.out.print(str1);
    }
}