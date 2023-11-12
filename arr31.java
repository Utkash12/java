//first repeating number
public class arr31{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10,1,2,3};
        int val=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    val=arr[i];
                }
            }
        }
        System.out.println(val);
    }
}