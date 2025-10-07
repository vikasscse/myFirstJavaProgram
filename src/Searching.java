public class Searching {
    public static void main(String[] args) {
        //Search for a scroll ID in the archive.
        //● Input: arr=[2,5,7,8], key=7
        //● Output: 2
        int [] arr={2,5,7,8};
        int key=7;
        int index=-1;
        int low=0; int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key) {
                index = mid;
                break;
            }
            else if(arr[mid]>key){
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        System.out.println(index);

    }
}
