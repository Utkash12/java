public class arr77 {
    public static void main(String[] args){
        int[][] arr={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        for(int i=0;i<=3;i++){
            for(int j=1;j<=3;j++){
                arr[i][j]=arr[i][j]+arr[i][j-1];
            }
        }
        for(int j=0;j<=3;j++){
            for(int i=1;i<=3;i++){
                arr[i][j]=arr[i][j]+arr[i-1][j];
            }
        }
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println("    ");
        }
    }
}