package com.designpattern.study.iterator.headFast.four;

/**
 * Java自带迭代器
 */
public class WaitressTest {

    public static void main(String[] args) {
        Waitress waitress = new Waitress(new DinerMenu(), new PancakeHouseMenu(), new CafeMenu());
        waitress.printMenu();
    }

}
