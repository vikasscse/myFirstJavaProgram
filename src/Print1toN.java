import java.util.Scanner;

public class Print1toN {
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0) return ;
        print(n-1);
        System.out.print(n+" ");
    }
}

