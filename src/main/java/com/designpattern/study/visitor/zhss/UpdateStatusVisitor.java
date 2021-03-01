package com.designpattern.study.visitor.zhss;

public class UpdateStatusVisitor implements Visitor {

    private String status;

    public UpdateStatusVisitor(String status) {
        this.status = status;
    }

    public void visit(Department dept) {
        if(dept.getChildren().size() > 0) {
            for(Department child : dept.getChildren()) {
                child.accept(this);
            }
        }
        System.out.println("将部门【" + dept.getName() + "】的状态修改为：" + status);
    }

}
