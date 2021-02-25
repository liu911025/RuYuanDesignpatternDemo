package com.designpattern.study.iterator.headFirst.three;

/**
 * Java自带迭代器
 */
public class WaitressTest {

    public static void main(String[] args) {
        Waitress waitress = new Waitress(new DinerMenu(), new PancakeHouseMenu());
        waitress.printMenu();
    }

}
