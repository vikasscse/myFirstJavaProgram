public class Rotate90Degree {
    public static void main(String[] args) {
        int m=4;
        int [][]arr ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0;i<m;i++){                     //transpose
            for(int j=i+1;j<m;j++){

                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;

            }
        }
        for(int i=0;i<m;i++){                 //swap
            for(int j=0;j<m/2;j++){
                int n=arr[i][j];
                arr[i][j]=arr[i][m-1-j];
                arr[i][m-1-j]=n;

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
