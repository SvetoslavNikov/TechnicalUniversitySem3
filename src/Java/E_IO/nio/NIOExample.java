package Java.E_IO.nio;

import java.nio.*;                // Import NIO package for buffers and channels
import java.nio.channels.*;        // Import channels for file operations
import java.nio.file.*;            // Import file-related classes
import java.io.IOException;       // Import exception handling for I/O

public class NIOExample {
    public static void main(String[] args) throws IOException {

        // Create a Path object pointing to the file "data.txt"
        Path path = Paths.get("data.txt");  // Path represents the file location

        // Open a FileChannel for reading the file
        // FileChannel allows reading from or writing to a file in an efficient manner.
        FileChannel fileChannel = FileChannel.open(path, StandardOpenOption.READ);  // Open the file channel in read mode

        // Create a ByteBuffer to store the file data temporarily
        // ByteBuffer is used to temporarily hold data before reading from or writing to a channel.
        ByteBuffer buffer = ByteBuffer.allocate(1024);  // Allocate 1024 bytes for the buffer

        // Read the file into the buffer
        // The fileChannel.read(buffer) reads data from the file into the buffer.
        // The number of bytes read is returned, indicating how much data was copied into the buffer.
        int bytesRead = fileChannel.read(buffer);  // Read data from the file into the buffer

        // Check if anything was read (bytesRead > 0 means data was read)
        if (bytesRead > 0) {  // If data was read successfully
            buffer.flip();  // Switch the buffer from writing mode to reading mode

            // Read the content from the buffer and print it
            // Read the data from the buffer and print it byte by byte as characters.
            while (buffer.hasRemaining()) {  // While there’s still data in the buffer
                System.out.print((char) buffer.get());  // Convert byte to char and print it
            }
        }

        // Close the fileChannel
        // Closing the channel releases the system resources it’s using (e.g., file handles).
        fileChannel.close();  // Close the channel to free resources
    }
}
