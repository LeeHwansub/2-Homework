package chap12.nomal;

import java.util.HashSet;

public class Application01 {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Orange");
        hs.add("Apple");

        System.out.println("Hashset의 사이즈는 : " + hs.size());
    }
}
