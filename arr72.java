public class arr72{
    public static void main(String[] args){
        // Scanner sc=new scanner(System.in);
        int[][] arr=new int[5][];
        for(int i=0;i<5;i++){
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println("    ");
        }
    }
}
// public class arr72{
//     public static void main(String[] args){
//         int[][] arr=new int[5][];
//         for(int i=0;i<5;i++){
//             // arr[i]=new arr[i+1];
//             arr[i]=new int[i+1];
//             arr[i][0]=arr[i][i]=1;
//             for(int j=1;j<i;j++){
//                 arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
//             }
//         }
//         for(int i=0;i<5;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print(arr[i][j]+"    ");
//             }
//             System.out.println("    ");
//         }
//     }
// }