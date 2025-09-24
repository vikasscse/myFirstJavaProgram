import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            int result=fibonaci(n);
            System.out.print(result+" ");

    }
    public static int fibonaci(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);
    }
}
