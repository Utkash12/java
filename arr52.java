public class arr52{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int[] ans=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            ans[i]=count;
            count=count+arr[i];
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(arr[i]+"   ");
            System.out.println(" ");
            // System.out.print(ans[i]+"   ");
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+"   ");
        }
    }
}