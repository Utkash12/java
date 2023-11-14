public class arr34{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]>arr[j]){
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                i++;
                j--;
            }
            else{
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j];
                i++;
                j--;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}