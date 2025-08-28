package yx.injection;

public class Boy {
    private String name;
    private Girl girl;

    public void findGf() {
        System.out.println("找到女朋友是：" + girl);
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", girl=" + girl +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    // getters / setters / toString()
}