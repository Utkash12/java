public class arr47{
    public static void main(String[] args){
        int[] arr={1,0,0,0,1,1,1,0,0,1,0,1};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        int j=0;
        for(int i=0;i<count;i++){
            arr[j]=0;
            j++;
        }
        for(int k=j;k<arr.length;k++){
            arr[k]=1;
        }
        for(int x=0;x<arr.length;x++){
            System.out.print(arr[x]+"  ");
        }
    }
}