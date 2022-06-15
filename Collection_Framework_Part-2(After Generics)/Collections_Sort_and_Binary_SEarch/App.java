package Collections_Sort_and_Binary_SEarch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);


        System.out.println(Collections.binarySearch(list, 50));
        System.out.println(Collections.binarySearch(list, 89));

    }
}
