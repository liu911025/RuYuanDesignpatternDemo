package com.designpattern.study.composite.headFast.one;

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
}
