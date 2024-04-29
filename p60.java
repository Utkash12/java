public class p60 {
    public static void main(String[] args){
        int[] arr={95,34,63,22,15,23,65,66,44,33,22,10};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"   ");
        }
    }
}