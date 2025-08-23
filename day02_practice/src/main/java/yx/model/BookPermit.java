package yx.model;

public class BookPermit {
    private String color;
    private String level;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "BookPermit{" +
                "color='" + color + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
