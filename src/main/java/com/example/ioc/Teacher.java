package com.yx.ioc;

public class Teacher {
    private String name;
    private String addr;

    public Teacher() {
    }                 // 必须要有无参构造器

    // setter / getter
    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Teacher { name='" + name + "', addr='" + addr + "' }";
    }
}