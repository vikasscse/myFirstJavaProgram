public class LostSoldier {
    public static int findMission(int [] arr){
        int lo=0,hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==mid){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return lo;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5};
        System.out.println(findMission(arr));
    }
}
