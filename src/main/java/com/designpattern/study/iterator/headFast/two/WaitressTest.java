package com.designpattern.study.iterator.headFast.two;

public class WaitressTest {

    public static void main(String[] args) {
        Waitress waitress = new Waitress(new DinerMenu(), new PancakeHouseMenu());
        waitress.printMenu();
    }

}
