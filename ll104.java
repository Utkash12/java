public class ll104 {
    public static class Node{
        char ch;
        Node next;
        Node(char d){
            this.ch=d;
            this.next=null;
        }
    }
    public static class Stack{
        Node head=null;
        int size=0;
        void push(char data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                size++;
            }
            else{
                temp.next=head;
                head=temp;
                size++;
            }
        }
        int size(){
            int s=0;
            if(head==null){
                System.out.println("Stack underflow..");
                return -1;
            }
            else{
                Node temp=head;
                while(temp!=null){
                    temp=temp.next;
                    s++;
                }
                return s;
            }
        }
        void pop(){
            if(head==null){
                System.out.println("Stack underflow..");
                return;
            }
            else{
                Node temp=head;
                System.out.println(temp.ch);
                head=head.next;
                size--;
            }
        }
        public static boolean isBalanced(String str){
            Stack st=new Stack();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch=='(' || ch=='{' || ch=='['){
                    st.push(ch);
                }
                else if(ch==')'){
                    if(st.size()==0 || st.head.ch!='('){
                        return false;
                    }
                    else{
                        st.pop();
                    }
                }
                else if(ch=='}'){
                    if(st.size()==0 || st.head.ch!='{'){
                        return false;
                    }
                    else{
                        st.pop();
                    }
                }
                else if(ch==']'){
                    if(st.size()==0 || st.head.ch!='['){
                        return false;
                    }
                    else{
                        st.pop();
                    }
                }
            }
            if(st.size()==0){
                return true;
            }
            else{
                return false;
            }
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.ch);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push('m');
        st.push('a');
        st.push('c');
        st.push('h');
        st.push('i');
        st.display();
    }
}
