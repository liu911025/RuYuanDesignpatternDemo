package com.designpattern.study.iterator.zhsh;

import java.util.ArrayList;
import java.util.List;

/**
 *  未使用设计模式
 */
public class WithoutIteratorPatternDemo {

    /**
     * 学生类
     */
    public static class Student {

        private String name;

        public Student(String name) {
            super();
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student [name=" + name + "]";
        }
    }


    /**
	 * 教室类
	 */
	/*public static class Classroom {

		private Student[] students;

		public Student[] getStudents() {
			return students;
		}

		public void setStudents(Student[] students) {
			this.students = students;
		}

	}*/

    /**
     * 将教师类中Student[]数组改为List, 遍历学生的方法就需要修改
     */
    public static class Classroom {

        private List<Student> students;

        public List getStudents() {
            return students;
        }

        public void setStudents(List students) {
            this.students = students;
        }

    }

    public static void main(String[] args) {

        /*
        // Classroom中Student[]为数组遍历方法
        Student student1 = new Student("小明");
        Student student2 = new Student("小王");

		Student[] students = new Student[2];
		students[0] = student1;
		students[1] = student2;

        Classroom classroom = new Classroom();
        classroom.setStudents(students);

        Student[] resultStudents = classroom.getStudents();
		for(Student resultStudent: resultStudents) {
			System.out.println(resultStudent);
		}*/

        // Classroom中Student为List遍历方法, 获取教室中学生返回值不一样
        Student student1 = new Student("小明");
        Student student2 = new Student("小王");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);

        Classroom classroom = new Classroom();
        classroom.setStudents(list);

        List<Student> resultStudents = classroom.getStudents();
        for(Student resultStudent: resultStudents) {
            System.out.println(resultStudent);
        }
    }
}
