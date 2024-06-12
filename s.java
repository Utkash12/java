public class s{
    public static class Stack {
        int[] arr = new int[5];
        int idx = -1;

        void push(int x) {
            if (idx > 4) {
                System.out.println("Stack is full..");
                return;
            } else {
                arr[++idx] = x;
            }
        }

        void pop() {
            if (idx ==-1) {
                System.out.println("Stack is empty..");
                return;
            } else {
                System.out.println(arr[idx]);
                idx--;
            }
        }

        void display() {
            if (idx == -1) {
                System.out.println("Stack is empty..");
            } else {
                for (int i = 0; i <=idx; i++) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        st.display();
    }
}