package com.designpattern.study.visitor.zhss;

public class VisitorPatternDemo {

    public static void main(String[] args) {
        Department parentDept = Department.initData();

        Visitor removeVisitor = new RemoveVisitor();
        parentDept.accept(removeVisitor);

        Visitor updateStatusVisitor = new UpdateStatusVisitor("禁用");
        parentDept.accept(updateStatusVisitor);
    }

}
