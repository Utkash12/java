public class array16{
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6,2,3,2};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                System.out.println("The number is present at index: "+i);
                count++;
            }
        }
        System.out.println("The number of times the number is present is: "+count);
    }
}