import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
            int total=print(arr,0,n);
            System.out.println(total);

    }
    public static int print(int []arr,int index,int n){
        if(index==n) return 0;

        return arr[index]+print(arr,index+1,n);
    }
}
