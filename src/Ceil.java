public class Ceil {
    public static void main(String[] args) {
        //Array = [1, 2, 4, 6, 6, 8], target = 5
        //● Ceil = 6.
        int [] arr={1, 2, 4, 6, 6, 8};
        int target=5;
        int lo=0;
        int n=arr.length-1;
        int ceil=-1;
        int hi=n-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=target){
                ceil=arr[mid];
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(ceil);

    }
}
