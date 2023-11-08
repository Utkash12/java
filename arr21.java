import java.util.*;
public class arr21{
    public static void main(String[] args){
        int[] arr={1,2,3,4,4,3,2,1,1,2,3,4};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                ans=i+1;
            }
        }
        System.out.println("Occured at "+ ans);
    }
}