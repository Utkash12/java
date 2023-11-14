public class arr44{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;
        }
        int k=3;
        int x1=0;
        int x2=3;
        for(int x=0;x<k;x++){
            while(x1<x2){
                arr[x1]=arr[x1]+arr[x2];
                arr[x2]=arr[x1]-arr[x2];
                arr[x1]=arr[x1]-arr[x2];
                x1++;
                x2--;
            }
        }
        
        for(int m:arr){
            System.out.print(m+" ");
        }
    }
}