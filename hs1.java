import java.util.HashSet;
public class hs1 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("India");
        hs.add("China");
        hs.add("USA");
        hs.add("Russia");
        hs.add("India");
        hs.add("China");
        System.out.println(hs);
        System.out.println(hs.contains("India"));
        System.out.println(hs.contains("Pak istan"));
        hs.remove("China");
        System.out.println(hs);
        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs);
        System.out.println(hs.isEmpty());

    }
}
