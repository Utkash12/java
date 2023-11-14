public class arr48{
    public static void main(String[] args){
        int[] arr={1,0,1,1,1,0,0,1,1,0,0,1};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
            else if(arr[left]==1 && arr[right]==0){
                arr[left]=arr[left]+arr[right];
                arr[right]=arr[left]-arr[right];
                arr[left]=arr[left]-arr[right];
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+"  ");
        // }
    }
}
}