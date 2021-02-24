package com.designpattern.study.iterator.zhsh;

import java.util.ArrayList;
import java.util.List;

public class IteratorPatternDemo {

    public interface Iterator {
        Boolean hasNext();
        Object next();
    }

    public interface Aggregate {
        Iterator iterator();
    }

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
     * 教室迭代器
     */
    public static class ClassroomIterator implements Iterator {

        private Classroom classroom;
        private int index = 0;

        public ClassroomIterator (Classroom classroom) {
            this.classroom = classroom;
        }

        @Override
        public Boolean hasNext() {
            if (index >= classroom.getLast() || classroom.getStudent(index) == null) {
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            Student student = classroom.getStudent(index);
            index++;
            return student;
        }
    }

    /**
     * 教室类Student[]
     */
	/*public static class Classroom implements Aggregate {

		private Student[] students;

		private int MAX_SIZE;

		private int last = 0;

        public Classroom(int MAX_SIZE) {
            this.MAX_SIZE = MAX_SIZE;
            students = new Student[MAX_SIZE];
        }

        public void addStudents(Student student) {
            if (last >= MAX_SIZE) {
                System.out.println("添加失败,教室坐不下了");
                return;
            }
            students[last] = student;
            last++;
		}

        public Student getStudent(int index) {
	        return students[index];
        }

		public int getLast() {
			return this.last;
		}

        @Override
        public Iterator iterator() {
            return new ClassroomIterator(this);
        }
    }*/

    /**
     * 教室类List
     */
    public static class Classroom implements Aggregate {

        private List<Student> students;

        private int MAX_SIZE;

        private int last = 0;

        public Classroom(int MAX_SIZE) {
            this.MAX_SIZE = MAX_SIZE;
            students = new ArrayList<>(MAX_SIZE);
        }

        public void addStudents(Student student) {
            students.add(student);
            last++;
        }

        public Student getStudent(int index) {
            return students.get(index);
        }

        public int getLast() {
            return this.last;
        }

        @Override
        public Iterator iterator() {
            return new ClassroomIterator(this);
        }
    }

    public static void main(String[] args) {
        // Classroom中Student类型不管是数组还是List都不影响遍历
        Student student1 = new Student("小明");
        Student student2 = new Student("小王");

        Classroom classroom = new Classroom(3);
        classroom.addStudents(student1);
        classroom.addStudents(student2);

        Iterator iterator = classroom.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
