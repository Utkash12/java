import java.util.*;
public class arr23{
    public static void main(String[] args){
        int[] arr={4,6,3,5,8,2};
        Scanner sc=new Scanner(System.in);
        System.out.println("Number to be checked: ");
        int num=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==num){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}