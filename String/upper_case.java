public class upper_case{
    public static void main(String args[]){
        String str1="hellow, i am prabhsamrath singh ";
        StringBuilder str2 = new StringBuilder("");
        char chr = Character.toUpperCase(str1.charAt(0));
        str2.append(chr);
        for(int i=1;i<str1.length();i++){
            if(str1.charAt(i)==' ' && i < str1.length()-1){
                str2.append(" ");
                chr = Character.toUpperCase(str1.charAt(i+1));
                str2.append(chr);
                i++;
            }
            else{
                chr = str1.charAt(i);
                str2.append(chr);
            }
        }
        System.out.println(str2);
    }
}