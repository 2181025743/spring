package yx.user;

public class Boy {
    private String name;
    private String gender;

    // getter和setter方法
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
        return "Boy{name='" + name + "', gender='" + gender + "'}";
    }
}