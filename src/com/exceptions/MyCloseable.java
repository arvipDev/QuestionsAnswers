package com.exceptions;

import java.io.Closeable;
import java.io.IOException;

public class MyCloseable implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing connection by doing stuff that needs to be done to close DB");
    }
}
