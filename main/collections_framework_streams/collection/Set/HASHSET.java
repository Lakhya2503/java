package collections_framework_streams.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HASHSET {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);

        //Iterator
        Iterator it = set.iterator();

        while (it.hasNext()){
            System.out.print(it.next()+", ");
        }


//        if (set.contains(2)) {
//            System.out.println("set containes 2");
//        }
//
//        set.remove(2);
//        System.out.println(set);


    }
}
