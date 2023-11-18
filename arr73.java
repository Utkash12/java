public class arr73{
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int top=0;
        int bottom=3;
        int left=0;
        int right=3;
        int total=0;
        while(top<bottom && left<right){
            for(int i=0;i<4 && total<=12;i++){
                System.out.print(arr[top][i]+" ");
                total++;
            }
            top++;
            for(int i=top;i<=bottom && total<=12;i++){
                System.out.print(arr[i][right]+" ");
                total++;
            }
            right--;
            for(int i=right;i>=left && total<=12;i--){
                System.out.print(arr[bottom][i]+" ");
                total++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                System.out.print(arr[i][left]+" ");
                total++;
            }
            left++;
        }
        System.out.println("Total elements: "+total);

    }
}