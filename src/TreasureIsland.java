public class TreasureIsland {
    public static void main(String[] args) {
        //Input:
        //
        // 3 3
        //1 2 3
        //4 5 6
        //7 8 9
        //● Output: Row 2 (sum=24)
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int MaxSum=0;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum=sum+arr[i][j];
            }
            if(sum>MaxSum){
                MaxSum=sum;
                index=i;
            }
        }
        System.out.println("index "+index +"sum "+" "+MaxSum);
    }
}
