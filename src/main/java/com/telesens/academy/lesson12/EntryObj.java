package com.telesens.academy.lesson12;

import java.util.Objects;

public class EntryObj {
    private Object key;
    private Object value;

    public EntryObj(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntryObj entryObj = (EntryObj) o;
        return Objects.equals(key, entryObj.key) &&
                Objects.equals(value, entryObj.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
