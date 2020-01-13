package com.javalesson.oop.generics;

import java.util.List;

public interface BoxList<E,T> extends List<E> {

E calcsum (E elem1, T elem2);
}
