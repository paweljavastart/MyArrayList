import java.util.Arrays;

public class MyList<T> {

    public static final int INITIAL_CAPACITY = 10;

    private Object[] internalArray;
    private int size;

    // null, null, null, null, null, null,
    // el, null, null
    public MyList() {
        internalArray = new Object[INITIAL_CAPACITY];
    }

    public void add(T element) {
        if (size >= internalArray.length) {
            increaseArrayCapacity();
        }
        internalArray[size] = element;
        size++;
    }

    public void add(T element, int index) {
        //  "a", "b", "c", "d", "e"
        // add("X", 1);
        // "a", "X", "b", "c", "d", e"
    }

    public void remove(int index) {

    }


    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(index + " jest poza zakresem list o wielkosci " + size);
        }
        return (T) internalArray[index];
    }

    public int size() {
        return size;
    }

    private void increaseArrayCapacity() {
        int oldCapacity = internalArray.length;
        int newCapacity = oldCapacity * 2;
        Object[] newArray = new Object[newCapacity];
        //        System.arraycopy(internalArray, 0, newArray, 0, internalArray.length);
        newArray = Arrays.copyOf(internalArray, newCapacity);
        internalArray = newArray;
    }
}
