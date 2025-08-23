package yx.model;

public class Student {
    private String name;
    private String gender; // 男 or 女

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', gender='" + gender + "'}";
    }
}