import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=product(n);
        System.out.println(result);
    }
    public static int product(int n){
        if(n==0) return 1;
        return n* product(n-1);
    }
}
