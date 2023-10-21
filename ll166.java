public class ll166{
    public static void main(String[] args) {
        int[] arr={1,3,7,5,4,8,2,3,1,4};
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    ans[i]=arr[j];
                    break;
                }
                else{
                    ans[i]=-1;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}