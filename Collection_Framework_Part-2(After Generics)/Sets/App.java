package Sets;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        // Does not allow duplicate values
        // No Index value

        Set<String> set = new HashSet<>();
        set.add("Chandu");
        set.add("Miku");
        set.add("Tillu");
        set.add("KirA");
        set.add("BeasT");
        set.add("Chandu");

        for (String string : set) {
            System.out.println(string);
        }

        System.out.println(set.contains("KirA"));


    }
}
