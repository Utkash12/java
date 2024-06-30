//previous greater element
public class s25{
    public static void greater(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int max=-1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    max=arr[j];
                    break;
                }
                else{
                    max=-1;
                }
            }
            res[i]=max;
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr={1,3,2,5,6,4,2,7,3};
        greater(arr);
    }
}