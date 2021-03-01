package com.designpattern.study.composite.zhss.without;

public class WithoutCompositePatternDemo {

    public static void main(String[] args) {
        Department parentDept = Department.initData();

        for (Department department : parentDept.getChildren()) {
            if (department.getChildren().size() > 0) {
                for (Department child : department.getChildren()) {
                    child.remove();
                }
            }
            department.remove();
        }
        parentDept.remove();
    }
    
}
