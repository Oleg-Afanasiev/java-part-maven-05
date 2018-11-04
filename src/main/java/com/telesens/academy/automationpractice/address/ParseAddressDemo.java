package com.telesens.academy.automationpractice.address;

import com.academy.automationpractice.ddt.framework.model.AddressData;

public class ParseAddressDemo {
    public static void main(String[] args) {
        String rawLine = "Kolya,Ivanov,Petrovskogo st. 35,Kharkov,Alaska,61033,United States,+3809353613437,093234567,addressAddedRef";
        AddressData address = parseAddress(rawLine);
//        AddressData address = new AddressData()
//                .withAddress("address");

        System.out.println(address);
    }

    public static AddressData parseAddress(String rawLine) {
        AddressData address = new AddressData()
                .withAddress("address");
        return address;
    }
}
