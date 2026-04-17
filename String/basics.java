import java.util.*;
public class basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //! creating stiring
        Character arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        //!input & output
        String name = sc.nextLine();
        System.out.println(name);

        //! string length
        String fullname = "Prabhsamrath Singh";
        System.out.println(fullname.length());
    }
}