public class arr14{
    public static void main(String[] args){
        int[][] arr=new int[2][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        // arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println();
    }
}