package com.designpattern.study.composite.zhss.without;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Department> children = new ArrayList<Department>();

    public Department(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Department> getChildren() {
        return children;
    }
    public void setChildren(List<Department> children) {
        this.children = children;
    }

    public void remove() {
        System.out.println("删除部门【" + name + "】");
    }


    public static Department initData() {
        Department leafDept1 = new Department("叶子部门1");
        Department leafDept2 = new Department("叶子部门2");
        Department leafDept3 = new Department("叶子部门3");

        Department subDept1 = new Department("子部门1");
        subDept1.getChildren().add(leafDept1);
        subDept1.getChildren().add(leafDept2);

        Department subDept2 = new Department("子部门2");
        subDept2.getChildren().add(leafDept3);

        Department parentDept = new Department("父部门");
        parentDept.getChildren().add(subDept1);
        parentDept.getChildren().add(subDept2);
        return parentDept;
    }
}
