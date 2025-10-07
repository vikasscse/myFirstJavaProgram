public class print1tonByRecursion {
    public static void main(String[] args) {
        //Print numbers 1 to n using recursion.
        //● Input: n=5
        //● Output: 1 2 3 4 5
        int n=5;
        print(n);
    }
    public static void print(int n){
        if(n==0) return ;
       print(n-1);
        System.out.print(n+" ");
    }
}
