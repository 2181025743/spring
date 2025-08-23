package yx.injection;

public class Student {
    private String name;
    private int age;
    private Teacher teacher;

    public Student() {
    } // 无参构造，Spring必须使用

    public Student(String name, int age, Teacher teacher) {
        this.name = name;
        this.age = age;
        this.teacher = teacher;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age +
                ", teacher=" + teacher + "}";
    }
}