import java.lang.reflect.Array;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("dd");


        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("s");
        MyList<String> myList = new MyList<>();

        Map<String, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();


        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        myList.add("e");
        myList.add("f");
        myList.add("g");
        myList.add("h");
        myList.add("i");
        myList.add("j");
        myList.add("l");
        myList.add("m");


        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
