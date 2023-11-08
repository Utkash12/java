import java.util.*;
public class arr20{
    public static void main(String[] args){
        int[] arr={1,2,3,4,3,2,1,1,2,3,2,1};
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Number to be checked: ");
        int num=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println("Number occured "+count+" times");
    }
}