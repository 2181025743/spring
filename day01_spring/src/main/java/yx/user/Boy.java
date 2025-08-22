package yx.user;

public class Boy {
    private String name;
    private int age;
    private Girl girl;

    public Boy() {
        System.out.println("Boy构造方法被调用");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    public void findGf() {
        System.out.println(name + " 找到女朋友: " + girl.getName());
    }

    @Override
    public String toString() {
        return "Boy{name='" + name + "', age=" + age + ", girl=" + girl + "}";
    }
}