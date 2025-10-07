public class FirstOccurrence {
    public static void main(String[] args) {
        //Input: arr=[1,2,2,2,3], key=2
        //● Output: 1
        int [] arr={1,2,2,2,3};
        int key=2;
        int index=-1;
        int lo=0; int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==key){
                index=mid;
                hi=mid-1;
            }
            else if(arr[mid]<key){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        System.out.println(index);
    }
}
