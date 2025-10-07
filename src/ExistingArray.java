public class ExistingArray {
    public static void main(String[] args) {
        // Input: arr=[10,20,30], key=25
        //● Output: -1
        int [] arr={10,20,30};
        int index=-1;
        int lo=0;int hi=arr.length-1;
        int key=25;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==key){
                index=mid;
                break;
            }
            else if(arr[mid]>key){
                hi=mid-1;
            }
            else lo=mid+1;


        }
        System.out.println(index);
    }
}
