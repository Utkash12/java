public class arr25{
    public static void main(String[] args){
        int[] arr={1,4,3,2,5,7,6,5,4,3,8,9};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
                else{
                    continue;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}