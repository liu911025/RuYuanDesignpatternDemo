package com.designpattern.study.iterator.headFirst.two;

import java.util.ArrayList;

/**
 * PancakeHouseMenu迭代器
 */
public class PancakeHouseMenuIterator implements Iterator{

    private ArrayList items;
    private int position = 0; // 遍历数组位置

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Object o = items.get(position);
        position++;
        return o;
    }
}
