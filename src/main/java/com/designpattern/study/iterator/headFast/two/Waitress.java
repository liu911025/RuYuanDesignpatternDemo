package com.designpattern.study.iterator.headFast.two;

import java.util.ArrayList;

public class Waitress {

    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        waitress.printMenu();
    }

    /**
     * 打印出菜单上的每一项
     */
    public void printMenu() {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

        // 遍历dinerMenu菜单
        Iterator iterator = dinerMenu.createIterator();
        printMenu(iterator);
        // 遍历pancakeHouseMenu菜单
        Iterator iterator1 = pancakeHouseMenu.createIterator();
        printMenu(iterator1);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " -- " + menuItem.getPrice() + " -- " + menuItem.getDescription());
        }
        System.out.println("-----------------------------------------");
    }

    /**
     * 只打印早餐
     */
    public void printBreakfastMenu() {

    }

    /**
     * 只打印午餐
     */
    public void printLunchMenu() {

    }

    /**
     * 打印所有的素食菜单项
     */
    public void printVegetarianMenu() {

    }

    /**
     * 是否为素食, 是返回true, 否则false
     * @param name
     */
    public boolean isItemVegetarian(String name) {
        return false;
    }
}
