package com.telesens.academy.tests.lesson12;

import com.telesens.academy.lesson08.polymorphism.components.Button;
import com.telesens.academy.lesson12.Entry;
import com.telesens.academy.lesson12.EntryGeneric;
import com.telesens.academy.lesson12.EntryObj;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntryTests {

    @Test
    public void testSimpleEntry() {
        System.out.println("start 'testSimpleEntry'");
        long key = 12L;
        String value = "demoValue";

        Entry entry = new Entry(key, value);
        Entry entryEqual = new Entry(key, value);

        Assert.assertEquals(key, entry.getKey());
        Assert.assertEquals(value, entry.getValue());

        Assert.assertEquals(entry, entryEqual);
    }

    @Test
    public void testObjEntry() {
        System.out.println("start 'testObjEntry'");
        long value = 12L;
        String key = "demoValue";

        EntryObj entry = new EntryObj(key, value);
        EntryObj entryEqual = new EntryObj(key, value);

        String keyBack = (String)entry.getKey();
        long valueBack = (Long)entry.getValue();
        entry.setValue("4");

        Assert.assertEquals(key, entry.getKey());
        Assert.assertEquals(value, entry.getValue());

        Assert.assertEquals(entry, entryEqual);
    }

    @Test
    public void testGenericEntry() {
        System.out.println("start 'testGenericEntry'");
        long value = 12L;
        String key = "demoValue";

        EntryGeneric<String, Long> entry = new EntryGeneric<>(key, value);
//        EntryGeneric<Integer, Button> entry2 = new EntryGeneric<>(key, value);
        EntryObj entryEqual = new EntryObj(key, value);

        String keyBack = entry.getKey();
        long valueBack = entry.getValue();
        entry.setValue(4L);

        Assert.assertEquals(key, entry.getKey());
//        Assert.assertEquals(value, entry.getValue());

//        Assert.assertEquals(entry, entryEqual);
    }
}
