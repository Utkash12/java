import java.util.Scanner;
// import java.util.Stack;
public class st20{
    public static class Stack{
        String str=new String();
        Scanner sc=new Scanner(System.in);
        void push(){
            System.out.println("Enter the string to push:");
            str=sc.nextLine();
        }
        void balanced(){
            Stack st=new Stack();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                    st.push(str.charAt(i));
                }
                else if(str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']'){
                    if(st.isEmpty()){
                        System.out.println("Not balanced");
                        return;
                    }
                    else if(!isMatchingPair(st.pop(),str.charAt(i))){
                        System.out.println("Not balanced");
                        return;
                    }
                }
            }
            if(st.isEmpty()){
                System.out.println("Balanced");
            }
            else{
                System.out.println("Not balanced");
            }
        }
        boolean isMatchingPair(char ch1,char ch2){
            if(ch1=='(' && ch2==')'){
                return true;
            }
            else if(ch1=='{' && ch2=='}'){
                return true;
            }  
            else if(ch1=='[' && ch2==']'){
                return true;
            }
            else{
                return false;
            }
        }
        boolean isEmpty(){
            if(str.length()==0){
                return true;
            }
            else{
                return false;
            }
        }
        void display(){
            System.out.println(str);
        }
    }
    public static void main(String[] args){
        Stack st=new Stack();
        st.push();
        st.display();
    }
}