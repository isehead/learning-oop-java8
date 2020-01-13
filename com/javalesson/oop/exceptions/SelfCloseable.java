package com.javalesson.oop.exceptions;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface SelfCloseable extends Closeable {

    @Override
    void close() throws FileNotFoundException;
}
