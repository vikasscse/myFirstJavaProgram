public class NonDecreasingOrder {
    public static void main(String[] args) {
        //Input: arr=[1,3,5,7] → Output: true
        //Input: arr=[3,2,1] → Output: false
        int [] arr={1,3,5,7};
        boolean isNonDecreasing=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isNonDecreasing=false;
                break;
            }

        }
        System.out.println(isNonDecreasing);
    }
}
