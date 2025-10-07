public class DiagonalSum {
    public static void main(String[] args) {
        //Input:
        //
        // 3 3
        //1 2 3
        //4 5 6
        //7 8 9
        //● Output: 1+5+9 =15, 3+5+7 = 15
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int Sum=0;
        int SecSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    Sum=Sum+arr[i][j];
                }
                if(i+j==arr.length-1){
                    SecSum+=arr[i][j];
                }
            }
        }
        System.out.println(Sum+" "+SecSum);
    }
}
