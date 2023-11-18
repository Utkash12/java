public class arr74 {
    public static void main(String[] args) {
        int[][] arr=new int[7][7];
        int top=0;int bottom=6;int left=0;int right=6;int count=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=count++;
            }
            right--;
            for(int i=right;i>=left;i--){
                arr[bottom][i]=count++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=count++;
            }
            left++;
        }
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
