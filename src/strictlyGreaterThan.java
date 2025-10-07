public class strictlyGreaterThan {
    public static void main(String[] args) {
        //Array = [1, 2, 4, 6, 6, 8], target = 6
        //● Upper bound = index 5 (first element greater than 6 is 8).
        //Array = [1, 2, 4, 6, 6, 8], target = 7
        //● Upper bound = index 5 (8 is first > 7).
        int [] arr={1,2,4,6,6};
        int n=arr.length;
        int lo=0; int hi=n-1;
        int key=6;
        int ans=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>key){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(ans);
    }
}
