package yx.model;// PoolManager.java

import java.util.List;

public class PoolManager {
    private List<Student> students;

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void checkAccess() {
        for (Student s : students) {
            if ("男".equals(s.getGender())) {
                System.out.println(s.getName() + " 可以进入浴池洗浴 ");
            } else {
                System.out.println(s.getName() + " 不可以进入浴池 ");
            }
        }
    }
}