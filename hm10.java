import java.util.LinkedList;
public class hm10 {
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
        private int size;
        private float loadFactor;
        private int capacity;
        private int n;
        private LinkedList<Node>[] buckets;
        private void initBuckets(int N){
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
        }
        private int HashFunc(K key){
            int hc=key.hashCode();
            return (Math.abs(hc))%buckets.length;
        }
        public void put(K key,V value){
            int bi=HashFunc(key);
            LinkedList<Node> currBucket=buckets[bi];
            int ei=searchInBucket(currBucket,key);
        }
        private int searchInBucket(LinkedList<Node> ll,K key){
            for(int i=0;i<ll.size();i++){
                // Node node=ll.get(i);
                if(ll.get(i).key==key){
                    return i;
                }
            }
        }
        public int size(){
            return size;
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
        System.out.println("Testing put");

    }
}
