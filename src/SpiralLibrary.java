public class SpiralLibrary {
    public static void main(String[] args) {
        // 3 3
        //1 2 3
        //4 5 6
        //7 8 9
        //● Output: [1,2,3,6,9,8,7,4,5]
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int lo=0;int hi=arr.length-1;
        int top=0; int bottom=arr[0].length-1;
       while(lo<=hi && top<=bottom){
           for(int i=lo;i<=hi;i++){
               System.out.print(arr[top][i] + " ");
           }
           top++;
           for(int i=top;i<=bottom;i++){
               System.out.print(arr[i][hi]+ " ");
           }
           hi--;
           if (top <= bottom) {
               for (int i = hi; i >= lo; i--) {
                   System.out.print(arr[bottom][i] + " ");
               }
               bottom--;
           }
           if (lo <= hi) {
               for (int i = bottom; i >= top; i--) {
                   System.out.print(arr[i][lo] + " ");
               }
               lo++;
           }
       }

    }
}
