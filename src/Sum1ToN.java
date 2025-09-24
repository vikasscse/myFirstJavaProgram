import java.util.Scanner;

public class Sum1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int result=print(n);
        System.out.println(result);
    }
    public static int print(int n){
        if (n==0) return 0;
        return n + print(n-1);

    }
}
