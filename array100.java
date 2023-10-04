public class array100 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,3,4,4,4,5,5,6};
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            int check=arr1[i];
            for(int j=i+1;j<arr1.length;j++){
                if(check==arr1[j]){
                    break;
                }
                else{
                    arr2[j]=check;
                }
            }
        }
        for(int j=0;j<arr1.length;j++){
            System.out.print(arr2[j]+"  ");
        }
    }
}
