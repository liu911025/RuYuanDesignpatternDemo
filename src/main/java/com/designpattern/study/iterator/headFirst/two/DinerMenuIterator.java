package com.designpattern.study.iterator.headFirst.two;

/**
 * DinerMenu迭代器
 */
public class DinerMenuIterator implements Iterator {

    private MenuItem[] items;
    private int position = 0;       //记录遍历数组位置

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
