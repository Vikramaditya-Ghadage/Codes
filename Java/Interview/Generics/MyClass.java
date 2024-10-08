import java.util.*;
class MyArrayList<T> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Method to add elements to the list
    public void add(T element) {
        // Ensure capacity before adding
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // Method to get elements by index
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index]; // Casting to the generic type T
    }

    // Method to remove an element by index
    public T remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        @SuppressWarnings("unchecked")
        T oldValue = (T) elements[index];
        // Shift elements to the left to fill the gap
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null; // Clear the last element
        return oldValue;
    }

    // Get current size of the list
    public int size() {
        return size;
    }

    // Ensure the internal array has enough capacity
    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    // Display all elements in the list
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

   
}

public class MyClass {
   public static void main(String[] args) {
        // Example usage
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        list.display(); // Output: Apple Banana Orange

        System.out.println("Element at index 1: " + list.get(1)); // Output: Banana

        list.remove(1); // Removing "Banana"
        list.display(); // Output: Apple Orange
    }
}
