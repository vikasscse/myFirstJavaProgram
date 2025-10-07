public class KingFeast {
    public static void main(String[] args) {
        int [] arr={2,7,1,9,5};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             if(arr[i]>max){
                 max=arr[i];
             }
        }
        System.out.println(max);
    }
}
