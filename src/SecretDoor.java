public class SecretDoor {
    public static void main(String[] args) {
        //Q18. The Secret Door
        //Doors are numbered in increasing order. Find target door using binary search.
        //● Input: arr=[1,3,5,7,9], key=7
        //● Output: 3
        int [] arr={1,3,5,7,9};
        int key=7;
        int lo=0; int hi=arr.length-1; int index=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==key){
                index=mid;
                break;
            }
            else if(arr[mid]>key){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        System.out.println(index);

    }
}
