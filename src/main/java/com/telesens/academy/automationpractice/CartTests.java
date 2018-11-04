package com.telesens.academy.automationpractice;

import com.telesens.academy.automationpractice.annotation.Log;
import com.telesens.academy.automationpractice.annotation.TestRun;
import com.telesens.academy.automationpractice.model.EntityDress;

public class CartTests {

    private String browser;
    private String baseUrl;

    public void init(String browser, String baseUrl) {
        this.browser = browser;
        this.baseUrl = baseUrl;
    }

    @TestRun
    public void testUnderAnnotation() {
        System.out.println("testUnderAnnotation");
    }

    public void testAddDressToCart(EntityDress addedDress, int amount) {
        beforeTest();
        System.out.println("Find and Click more by " + addedDress);
//        EntityDress entityAdded = readCurrentEntityFromUI();

        System.out.println(String.format("Add entity '%s', amount: %d to cart",
                addedDress, amount));
        System.out.println("Go to cart");

        EntityDress entityFromCart = readEntityFromCart();
        int  amountFromCart = readAmountFromCart();
        double totalFromCart = readTotalFromCart();
        double total = amountFromCart*addedDress.getPrice();
        System.out.println(String.format("Read entity '%s' from cart", entityFromCart));


        System.out.println("Assert equals added entity and read entity");
        assert addedDress.equals(entityFromCart);
        assert amount == amountFromCart;
        assert total == totalFromCart;
        System.out.println("Finish 'testAddDressToCart'");
    }

    private double readTotalFromCart() {
        return 156.0;
    }

    private int readAmountFromCart() {
        return 2;
    }

    private EntityDress readEntityFromCart() {
        EntityDress entityFromCart = new EntityDress();
        entityFromCart.setName("Printed Dress");
        entityFromCart.setModel("demo_3");
        entityFromCart.setSize("S");
        entityFromCart.setColor("Orange");
        entityFromCart.setPrice(26.00);
        return entityFromCart;
    }

    private EntityDress readCurrentEntityFromUI() {
        EntityDress entityAdded = new EntityDress();
        entityAdded.setName("Printed Dress");
        entityAdded.setModel("demo_3");
        entityAdded.setSize("S");
        entityAdded.setColor("Orange");
        entityAdded.setPrice(26.00);
        return entityAdded;
    }

    public void beforeTest() {
        System.out.println("Start 'testAddDressToCart'");
        System.out.println(String.format("Open browser '%s'", browser));
        System.out.println(String.format("Go to '%s'", baseUrl));
        System.out.println("Go to 'Dresses' category");
    }

    @Log
    @TestRun
    private void testUnderAnnotation2() {
//        System.out.println("testUnderAnnotation2");
    }
}
