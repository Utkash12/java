public class arr40 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=3;
        int n=arr.length;
        int[] ans=new int[n];
        k=k%n;
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
