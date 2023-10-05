public class ll114{
    public static void main(String[] args){
        int[] arr1={1,2,2,2,3,3,3,4,4,5,5,6};
        int[] arr2=new int[arr1.length];
        int j=0;
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]!=arr1[i+1]){
                arr2[j]=arr1[i];
                j++;
            }
        }
        arr2[j]=arr1[arr1.length-1];
        for(int i=0;i<=j;i++){
            System.out.println(arr2[i]);
        }
    }
}
