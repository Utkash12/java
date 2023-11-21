//merge sort
public class arr90{
    public static int[] mergeSort(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int midpoint=arr.length/2;
        int[] left=new int[midpoint];
        int[] right;
        if(arr.length%2==0){
            right=new int[midpoint];
        }
        else{
            right=new int[midpoint+1];
        }
        for(int i=0;i<midpoint;i++){
            left[i]=arr[i];
        }
        for(int j=0;j<right.length;j++){
            right[j]=arr[midpoint+j];
        }
        int[] result=new int[arr.length];
        left=mergeSort(left);
        right=mergeSort(right);
        result=merge(left,right);
        return result;
    }
    public static int[] merge(int[] left,int[] right){
        int[] result=new int[left.length+right.length];
        int leftPointer,rightPointer,resultPointer;
        leftPointer=rightPointer=resultPointer=0;
        while(leftPointer<left.length || rightPointer<right.length){
            if(leftPointer<left.length && rightPointer<right.length){
                if(left[leftPointer]<right[rightPointer]){
                    result[resultPointer++]=left[leftPointer++];
                }
                else{
                    result[resultPointer++]=right[rightPointer++];
                }
            }
            else if(leftPointer<left.length){
                result[resultPointer++]=left[leftPointer++];
            }
            else if(rightPointer<right.length){
                result[resultPointer++]=right[rightPointer++];
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr={1,23,54,32,12,87,67,56,43,22,11};
        int[] sorted=mergeSort(arr);
        for(int i=0;i<sorted.length;i++){
            System.out.print(sorted[i]+"   ");
        }
    }
}