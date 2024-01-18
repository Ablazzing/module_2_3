package com.javaacademy.lessons.lesson1.ex1;

import com.javaacademy.lessons.lesson1.ex1.product.Phone;
import com.javaacademy.lessons.lesson1.ex1.product.Product;
import com.javaacademy.lessons.lesson1.ex1.product.Vodka;
import com.javaacademy.lessons.lesson1.ex1.shop.Shop;
import com.javaacademy.lessons.lesson1.ex1.shop.ShopVodka;
import com.javaacademy.lessons.lesson1.ex1.shop.ShopWithoutGeneric;

public class Runner {
    public static void main(String[] args) {
        ShopVodka shopVodka = new ShopVodka();
        Vodka vodka = new Vodka(500, 0.5);
        shopVodka.addProduct(vodka);
        Product product = shopVodka.saleProduct();
        System.out.println(product);


        Phone phone = new Phone(10_000);

        Shop<Vodka> vodkaShop = new Shop<>();
        vodkaShop.addProduct(vodka);
        Vodka vodka1 = vodkaShop.saleProduct();
        System.out.println(vodkaShop.getIncome());
        Shop<Product> vodkaShop11 = new Shop<>();


        ShopWithoutGeneric shopWithoutGeneric = new ShopWithoutGeneric();

    }
}
