public class Recursion {
    public static void main(String[] args){
        /*System.out.println(factorial(5));
    }

public static int factorial(int n) {
    if( n==1) {
        return 1;
    }
    return n * factorial(n-1);
}
}
*/
//print sum of n natural numbers using recursion
    
System.out.println(SumOfNNaturalNumbers(6));
}
public static int SumOfNNaturalNumbers(int n) {
    //n + SumOfNNatural numbers(n-1);
    if(n==1) {
        return 1;
}
return n + SumOfNNaturalNumbers(n-1);
}
}
