public class array50{
    public static void main(String[] args){
        int [][]a={{2,3},{4,5}};
        int [][]b={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[i][j]=b[i][j]+a[i][j];
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}