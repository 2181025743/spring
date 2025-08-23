package com.yx.question;

public class Teacher {
    private String name;
    private String addr;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
