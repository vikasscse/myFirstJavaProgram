public class MagicalScroll {
    public static void main(String[] args) {
        //● Input:
        //matrix = [[10,20,30], [40,50,60], [70,80,90]]
        //target = 60
        //● Output: (1,2)
        //● Constraints: 1 ≤ n,m ≤ 1000
        int [][]arr={{10,20,30},{40,50,60},{70,80,90}};
        int target=60;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
