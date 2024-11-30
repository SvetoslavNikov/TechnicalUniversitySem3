import java.util.*;
import java.util.function.*;

public class javaCore {
    
    public static class CustomArrayList<E> implements List<E> {
        private static final int DEFAULT_CAPACITY = 10;
        private Object[] elements;
        private int size;

        public CustomArrayList() {
            elements = new Object[DEFAULT_CAPACITY];
            size = 0;
        }

        @Override
        public boolean add(E element) {
            ensureCapacity();
            elements[size++] = element;
            return true;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends E> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public E get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            return (E) elements[index];
        }

        @Override
        public E set(int index, E element) {
            return null;
        }

        @Override
        public void add(int index, E element) {

        }

        @Override
        public E remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            E removedElement = (E) elements[index];

            // Shift elements to the left
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[--size] = null;
            return removedElement;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<E> listIterator() {
            return null;
        }

        @Override
        public ListIterator<E> listIterator(int index) {
            return null;
        }

        @Override
        public List<E> subList(int fromIndex, int toIndex) {
            return null;
        }

        private void ensureCapacity() {
            if (size == elements.length) {
                int newCapacity = elements.length * 2;
                elements = Arrays.copyOf(elements, newCapacity);
            }
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<E> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }
    }

    // Custom HashMap Implementation
    public static class CustomHashMap<K, V> implements Map<K, V> {
        private static final int DEFAULT_CAPACITY = 16;
        private static final float LOAD_FACTOR = 0.75f;

        private Entry<K, V>[] buckets;
        private int size;

        public CustomHashMap() {
            buckets = new Entry[DEFAULT_CAPACITY];
            size = 0;
        }

        @Override
        public V put(K key, V value) {
            if (key == null) {
                throw new IllegalArgumentException("Null keys not allowed");
            }

            int index = getBucketIndex(key);
            Entry<K, V> entry = buckets[index];

            while (entry != null) {
                if (entry.key.equals(key)) {
                    V oldValue = entry.value;
                    entry.value = value;
                    return oldValue;
                }
                entry = entry.next;
            }

            Entry<K, V> newEntry = new Entry<>(key, value);
            newEntry.next = buckets[index];
            buckets[index] = newEntry;
            size++;

            return null;
        }

        @Override
        public V remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends K, ? extends V> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<K> keySet() {
            return null;
        }

        @Override
        public Collection<V> values() {
            return null;
        }

        @Override
        public Set<Map.Entry<K, V>> entrySet() {
            return null;
        }

        @Override
        public V get(Object key) {
            int index = getBucketIndex((K) key);
            Entry<K, V> entry = buckets[index];

            while (entry != null) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
                entry = entry.next;
            }

            return null;
        }

        private int getBucketIndex(K key) {
            return Math.abs(key.hashCode() % buckets.length);
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        private static class Entry<K, V> {
            K key;
            V value;
            Entry<K, V> next;

            Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }
    }

    // Custom Stream Implementation
    public static class CustomStream<T> {
        private List<T> data;

        private CustomStream(List<T> data) {
            this.data = data;
        }

        public static <T> CustomStream<T> of(T... elements) {
            return new CustomStream<>(Arrays.asList(elements));
        }

        public CustomStream<T> filter(Predicate<? super T> predicate) {
            List<T> filteredList = new ArrayList<>();
            for (T item : data) {
                if (predicate.test(item)) {
                    filteredList.add(item);
                }
            }
            return new CustomStream<>(filteredList);
        }

        public <R> CustomStream<R> map(Function<? super T, ? extends R> mapper) {
            List<R> mappedList = new ArrayList<>();
            for (T item : data) {
                mappedList.add(mapper.apply(item));
            }
            return new CustomStream<>(mappedList);
        }

        public T reduce(T identity, BinaryOperator<T> accumulator) {
            T result = identity;
            for (T item : data) {
                result = accumulator.apply(result, item);
            }
            return result;
        }

        public List<T> collect() {
            return new ArrayList<>(data);
        }
    }

    // Custom Iterator Implementation
    public static class CustomIterator<T> implements Iterator<T> {
        private T[] elements;
        private int currentIndex = 0;

        public CustomIterator(T[] elements) {
            this.elements = elements;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < elements.length;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elements[currentIndex++];
        }
    }

    // Simplified Loops and Control Structures
    public static void forLoop(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void enhancedForLoop(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    public static void whileLoop(int[] array) {
        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

    public static void doWhileLoop(int[] array) {
        int index = 0;
        do {
            System.out.println(array[index]);
            index++;
        } while (index < array.length);
    }

    // Recursion Example
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Main method for demonstration
    public static void main(String[] args) {
        // Demonstrate custom implementations
        CustomArrayList<String> customList = new CustomArrayList<>();
        customList.add("Hello");
        customList.add("World");

        CustomHashMap<String, Integer> customMap = new CustomHashMap<>();
        customMap.put("One", 1);
        customMap.put("Two", 2);

        CustomStream<Integer> customStream = CustomStream.of(1, 2, 3, 4, 5);
        int sum = customStream
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .reduce(0, (a, b) -> a + b);
    }
}
