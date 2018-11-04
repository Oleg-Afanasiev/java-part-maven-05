package com.telesens.academy.automationpractice;

import com.academy.automationpractice.ddt.framework.model.AddressData;
import com.academy.telesens.automationpractice.address.ParseAddressDemo;
import com.academy.telesens.automationpractice.model.EntityDress;

public class TestRunner {
    public static void main(String[] args) {
        CartTests cartTests = new CartTests();
        cartTests.init("firefox", "http://automationpractice.com");

        EntityDress dressItem1 = new EntityDress();
        dressItem1.setName("Printed Dress");
        dressItem1.setModel("demo_3");
        dressItem1.setSize("S");
        dressItem1.setColor("Orange");
        dressItem1.setPrice(26.00);

        // ??? что делаем
        EntityDress dressItem2 = new EntityDress();
        dressItem2.setName("Printed Dress");
        dressItem2.setModel("demo_3");
        dressItem2.setSize("S");
        dressItem2.setColor("Orange");
        dressItem2.setPrice(26.00);

        Object[][] testData = {
                {dressItem1, 2},
                {dressItem2, 2}
        };

        String rawData = "";
        AddressData address = ParseAddressDemo.parseAddress(rawData);
        Object[][] addressData = {
                {address},
        };

        // TODO
        cartTests.testAddDressToCart(dressItem1, 2);
        cartTests.testAddDressToCart(dressItem2, 2);


    }
}
