package com.telesens.academy.lesson12;

public class Entry implements Comparable<Entry> {
    private String value;
    private long key;

    public Entry(long key, String value) {
        this.value = value;
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "value='" + value + '\'' +
                ", key=" + key +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entry)) return false;

        Entry entry = (Entry) o;


        if (getKey() != entry.getKey()) return false;
        return getValue() != null ? getValue().equals(entry.getValue()) : entry.getValue() == null;
    }

    @Override
    public int hashCode() {
        int result = getValue() != null ? getValue().hashCode() : 0;
        result = 31 * result + (int) (getKey() ^ (getKey() >>> 32));
        return result;
    }

    @Override
    public int compareTo(Entry o) {
        return this.getValue().compareTo(o.getValue());
    }
}
