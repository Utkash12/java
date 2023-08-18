import java.util.Scanner;
public class string61{
    public static boolean isPalindrome(StringBuilder str1){
        int i=0;
        boolean flag=true;
        int j=str1.length()-1;
        while(j>i){
            if(str1.charAt(i)==str1.charAt(j)){
                i++;
                j--;
                return true;  
            }
            else{
                return false;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be substringed: ");
        StringBuilder str=new StringBuilder(sc.nextLine());
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
                if(isPalindrome(str)){
                    count++;
                }
            }
        }
        System.out.println("the total number of pallindrome string are: "+count);
    }
}