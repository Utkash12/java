import java.util.Scanner;

public class string60{
    public static boolean isPalindrome(StringBuilder str1){
        int i=0;
        int j=str1.length()-1;
        boolean flag=true;
        while(j>i){
            if(str1.charAt(i)==str1.charAt(j)){
                i++;
                j--;
            }
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the string to be sub-stringed: ");
        String str = new String(sc.nextLine());
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length()+1; j++) {
                StringBuilder str2 = new StringBuilder(str.substring(i, j));
                if(isPalindrome(str2)){
                    count++;
                }
            }
        }
        System.out.println("The number of pallindromic substrings are: " + count);
    }
}