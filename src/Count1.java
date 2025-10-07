public class Count1 {
    public static void main(String[] args) {


        //3 3
        //1 0 1
        //0 1 0
        //1 0 1
        //● Output: 5
        int[][] arr = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
