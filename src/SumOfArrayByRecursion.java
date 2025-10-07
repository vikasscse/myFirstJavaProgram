public class SumOfArrayByRecursion {
    public static void main(String[] args) {
        //Find sum of array elements using recursion.
        //● Input: arr=[1,2,3,4]
        //● Output: 10
        int [] arr={1,2,3,4};
        int sum=0;
        int n=arr.length;
       int total= print(arr,n);
        System.out.println(total);
    }
    public static int print(int [] arr,int n){
      if(n<=0) return 0;
      return print(arr,n-1)+arr[n-1];


    }
}
