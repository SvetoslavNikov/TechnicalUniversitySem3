package javaLU.IteratorsAndComparators.Iterators.ComplexExample;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Library class that holds books
public class Library implements Iterable<String> {
    private String[] books;

    // Constructor to initialize books
    public Library(String... books) {
        this.books = books;
    }

    // Method from Iterable interface
    @Override
    public Iterator<String> iterator() {
        return new LibraryIterator();
    }

    // Nested class that implements Iterator
    private class LibraryIterator implements Iterator<String> {
        private int index = 0;

        // Check if there are more books
        @Override
        public boolean hasNext() {
            return index < books.length;
        }

        // Return the next book
        @Override
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            return books[index++];
        }
    }
    public static void main(String[] args) {
        Library library = new Library("Book1", "Book2", "Book3");

        // Use for-each loop (enabled by Iterable)
        for (String book : library) {
            System.out.println(book);
        }
    }
}
