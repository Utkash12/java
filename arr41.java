public class arr41 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int k=3;
        int[] ans=new int[arr.length];
        for(int i=0;i<=arr.length;i++){
            ans[i]=arr[k];
            k++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
