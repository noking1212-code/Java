public class operators{
    public static void main(String args[]){
        /*
        !OPERATORS
        ^   1. Arithmatic operator
        *       a. Binary operator
        ~           +
        ~           -
        ~           /
        ~           *
        ~           %(remainder)
        *       b. uninary operator
        ~           ++
        ~           --
        ^   2. Relational Operator 
        */
    
    //! binary operator
    // int a = 15;
    //int b = 5;
    // System.out.print("sum" + a+b);
    // System.out.print("difference" + a+b);
    // System.out.print("multiplication" + a*b);
    // System.out.print("division" + a/b);
    // System.out.print("divisor(remainder)" + a%b);
    
    //! unary operator
    //int a = 15;
    // int b = a++;
    // System.out.print("post increatment " + b + " " + a );
    // int b = ++a;
    // System.out.print("pre increatment " + b + " " + a );
    // int b = --a ;
    // System.out.print("pree increatment " + b + " " + a );
    // int b = a-- ;
    // System.out.print("post increatment " + b + " " + a );

    //! relational operator
    // int a = 10;
    // int b = 5;
    // System.out.println(a==b);
    // System.out.println(a!=b);
    // System.out.println(a>b);
    // System.out.println(a<b);
    // System.out.println(a>=b);
    // System.out.println(a<=b);

    //! logical operator
    // int a = 10;
    // int b = 5;
    // System.out.println((a==b) && (a!=b));
    // System.out.println((a==b) || (a!=b));
    // System.out.println(!(a<b));

    //! Assignment operator
    int a = 10;
    int b = 5;
    System.out.println(a+=b);
    System.out.println(a-=b);
    System.out.println(a*=b);   
    System.out.println(a/=b);
    System.out.println(a%=b);
    }
}
