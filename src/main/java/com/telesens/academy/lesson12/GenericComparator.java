package com.telesens.academy.lesson12;

import java.util.Comparator;

public class GenericComparator implements Comparator<EntryGeneric> {

    @Override
    public int compare(EntryGeneric o1, EntryGeneric o2) {
        return ((Comparable)o1.getKey()).compareTo(o2.getKey());
    }
}
