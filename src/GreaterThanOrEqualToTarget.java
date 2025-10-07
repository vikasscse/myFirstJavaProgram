public class GreaterThanOrEqualToTarget {
    public static void main(String[] args) {
        //Array = [1, 2, 4, 6, 6, 8], target = 6
        //● Lower bound = index 3 (first 6).
        //Array = [1, 2, 4, 6, 6, 8], target = 5
        //● Lower bound = index 3 (as 6 is the first ≥ 5)
        int [] arr={1,2,4,6,6,8};

        int index=arr.length;
        int key=6;
        int lo=0; int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=key){
                index=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(index);
    }
}
