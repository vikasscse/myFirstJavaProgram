public class Floor {
    public static void main(String[] args) {
        //Array = [1, 2, 4, 6, 6, 8], target = 5
        //● Floor = 4.
        //Array = [1, 2, 4, 6, 6, 8], target = 0
        //● Floor = -1 (no element ≤ 0).
        int [] arr={1, 2, 4, 6, 6, 8};
        int floor=-1;
        int lo=0; int target=5;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]<=target){
                floor=arr[mid];
                lo=mid+1;
            }
            else{
               hi=mid-1;
            }
        }
        System.out.println(floor);
    }
}
