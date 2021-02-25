package com.designpattern.study.iterator.headFirst.four;

import java.util.Iterator;

/**
 * Java自带迭代器
 * 添加Cafe菜单项
 */
public class Waitress {
    private Menu dinerMenu;
    private Menu pancakeHouseMenu;
    private Menu cafeMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu, Menu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.cafeMenu = cafeMenu;
    }

    /**
     * 打印出菜单上的每一项
     */
    public void printMenu() {
        // 遍历pancakeHouseMenu菜单
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        System.out.println("------早餐------");
        printMenu(pancakeIterator);
        // 遍历dinerMenu菜单
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("------午餐------");
        printMenu(dinerIterator);

        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("------晚餐------");
        printMenu(cafeIterator);

    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " -- " + menuItem.getPrice() + " -- " + menuItem.getDescription());
        }
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
