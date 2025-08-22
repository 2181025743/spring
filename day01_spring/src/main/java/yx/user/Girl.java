package yx.user;

public class Girl {
    private String name;
    private double height;
    private double weight;

    public Girl() {
        System.out.println("Girl构造方法被调用");
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{name='" + name + "', height=" + height + ", weight=" + weight + "}";
    }
}