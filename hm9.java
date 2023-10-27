public class hm9{
    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75f;
         private class Node{
            K key;
            V value;
            Node next;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
         }
         public int size(){
             return size;
         }
         public void put(K key,V value){

         }
         public V get(K key){
             return null;
         }
         public V remove(K key){
             return null;
         }

    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> mp=new MyHashMap<>();
        MyHashMap<String,String> mp2=new MyHashMap<>();
    }
}