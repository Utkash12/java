public class arr42{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] ans=new int[arr.length];
        int k=3;
        int j=0;
        for(int i=k;i<arr.length;i++){
            ans[j]=arr[i];
            j++;
        }
        for(int i=0;i<k;i++){
            ans[j]=arr[i];
            j++;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"  ");
        }
    }
}