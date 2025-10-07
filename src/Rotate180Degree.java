public class Rotate180Degree {
    public static void main(String[] args) {
        int m=4;
        int [][]arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // first colm ka swap then row ka swap...
        for(int i=0;i<m;i++){
            for(int j=0;j<m/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][m-1-j];
                arr[i][m-1-j]=temp;
            }
        }
        for(int i=0;i<m/2;i++){
            for(int j=0;j<m;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[m-1-i][j];
                arr[m-1-i][j]=temp;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
