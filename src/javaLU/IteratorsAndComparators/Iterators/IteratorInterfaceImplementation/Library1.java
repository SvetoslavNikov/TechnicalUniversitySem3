package javaLU.IteratorsAndComparators.Iterators.IteratorInterfaceImplementation;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Library1 implements Iterable<String> {
    String[] titles;

    public Library1(String... titles){
        this.titles = titles;
    }

    @Override
    public Iterator<String> iterator() {
        return new LibraryIterator();
        /* -- worse way
        Iterator<String> a = new Iterator<>(){
            private int index = titles.length-1;

            @Override
            public boolean hasNext() {
                return -1<index;
            }

            @Override
            public String next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                return (titles[index--]);
            }
        };
        return  a;*/
    }

//reverse iterator :)
    private class LibraryIterator implements Iterator<String>{
        private int index = titles.length-1;

        @Override
        public boolean hasNext() {
            return -1<index;
        }

        @Override
        public String next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return (titles[index--]);
        }
    }

    public static void main(String[] args) {
        Library1 a = new Library1("Harry", "Potter");

        Iterator<String> a1 = a.iterator();
        System.out.println(a1.next());
        System.out.println(a1.next());
    }
}
