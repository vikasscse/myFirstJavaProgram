public class TreasureMapLinear {
    public static void main(String[] args) {
        //n=3, m=3
        //matrix = [[1,2,3], [4,5,6], [7,8,9]]
        //target = 5
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target=5;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==target){
                    System.out.println("yes");
                    break;
                }

            }
        }
    }
}