package com.designpattern.study.composite.headFast.one;

import java.util.Iterator;
  
public class Waitress {
	private MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
}
