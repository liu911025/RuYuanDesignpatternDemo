package com.designpattern.study.composite.headFast.two;

import java.util.Iterator;

/**
 * 迭代器 + 组合模式
 */
public class Waitress {
	private MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}

	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator();

		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {

			}
		}
	}
}
