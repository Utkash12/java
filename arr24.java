import java.util.*;
public class arr24{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,7,6,5};
        System.out.println("Enter the number: ");
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(target==arr[i]+arr[j]+arr[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}