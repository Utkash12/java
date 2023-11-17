import java.util.Scanner;
public class arr65{
    public static void main(String[] args){
        //1 2 3
        //4 5 6
        //7 8 9
        
        //1 4 7
        //2 5 8
        //3 6 9

        //7 4 1
        //8 5 2
        //9 6 3
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<3;i++){
            for(int j=i;j<3;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println(" ");
        }
        System.out.println("Reversing an array: ");
        //reverse an array
        for(int i=0;i<3;i++){
            int start=0;
            int end=2;
            while(start<end){
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println(" ");
        }
    }
}